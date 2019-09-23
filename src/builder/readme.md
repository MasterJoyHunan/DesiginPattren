### 建造者模式

#### 模式定义
将一个复杂对象的构建与他的表示分离，使得同样的构建过程可以创建不同的表示

#### 适用场景
创建复杂对象

#### UML
![uml](http://img.masterjoy.top/20190923/e7584941bfeafccf7a97d8062c7957a7.png)

#### DEMO 克隆人
在9012年。人类掌握的克隆人的技术，但是克隆的步骤及其复杂，
但是像我们这种普通人并不关心过程，只关心结果

定义创建克隆人的过程
```java
abstract class HumanBuilder {
    abstract void buildHeader();

    abstract void buildBody();

    abstract void buildArmLeft();

    abstract void buildArmRight();

    abstract void buildLegLeft();

    abstract void buildLegRight();
}
```
定制化克隆人创建的过程
```java
public class FatHumanBuilder extends HumanBuilder {

    @Override
    void buildHeader() {
        System.out.println("胖 头");
    }

    @Override
    void buildBody() {
        System.out.println("胖 身体");
    }

    @Override
    void buildArmLeft() {
        System.out.println("胖 左手");
    }

    @Override
    void buildArmRight() {
        System.out.println("胖 右手");
    }

    @Override
    void buildLegLeft() {
        System.out.println("胖 左脚");
    }

    @Override
    void buildLegRight() {
        System.out.println("胖 右脚");
    }
}
```

工厂厂长按下一个按钮，工厂的生产机器就将克隆人，一个一个生产出来
```java
public class Director {

    private HumanBuilder human;

    public Director(HumanBuilder human) {
        this.human = human;
    }

    public void createHuman() {
        human.buildHeader();
        human.buildBody();
        human.buildArmLeft();
        human.buildArmRight();
        human.buildLegLeft();
        human.buildLegRight();
    }
}
```
因为缺少劳动力，我们找工厂厂长定制一个壮实的克隆人
```java
public class Test {

    public static void main(String[] args) {
        Director human = new Director(new FatHumanBuilder());
        human.createHuman();
    }
}

```

