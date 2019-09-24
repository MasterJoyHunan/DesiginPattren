### 装饰器模式

#### 模式定义
动态的给一个对象添加一些额外的职责，就增加功能来说，比生成子类更为灵活

#### 适用场景
在需要给一个类动态、灵活的添加新功能，不需要修改原来的类，也不需要生成新的子类

#### UML
![image.png](http://img.masterjoy.top/20190924/053b72962f79e38b97b256561a4eff0c.png)

#### DEMO 买奶茶
去商场买奶茶，大多数地方是可以加料的，比如额外加珍珠，西米，椰果，冰块。
可以想象的到，其实所有操作可以抽象为加料操作
```java
interface Seasoning {
    void addSeasoning();
}
```
所有奶茶都是由（正规情况下）奶、茶这基本的物料组成的
```java
public class MilkTea implements Seasoning {

    @Override
    public void addSeasoning() {
        System.out.println("标准动作 + 奶茶 ");
    }
}

```
额外加料父类
```java
public class SeasoningDecorator implements Seasoning {

    private Seasoning seasoning;

    public void setSeasoning(Seasoning seasoning) {
        this.seasoning = seasoning;
    }

    @Override
    public void addSeasoning() {
        if (seasoning != null) {
            seasoning.addSeasoning();
        }
    }
}
```
加蜂蜜
```java
public class HonySeasoning extends SeasoningDecorator {

    @Override
    public void addSeasoning() {
        super.addSeasoning();
        System.out.println(" + 蜂蜜");
    }
}
```
加冰
```java
public class IceSeasoning extends SeasoningDecorator {

    @Override
    public void addSeasoning() {
        super.addSeasoning();
        System.out.println(" + 冰");
    }
}
```
现在你可以进行定制化你的奶茶了
```java
public class Test {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();
        HonySeasoning honySeasoning = new HonySeasoning();
        IceSeasoning iceSeasoning = new IceSeasoning();

        honySeasoning.setSeasoning(milkTea);
        iceSeasoning.setSeasoning(honySeasoning);
        iceSeasoning.addSeasoning();
    }
}
```
