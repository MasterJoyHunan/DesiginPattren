### 访问者模式

#### 模式定义
表示一个作用于某个对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作

#### 适用场景
比较稳定的数据结构，易于变化的算法，访问者模式将有关算法增加变得容易

大多数情况下你不需要访问者模式，因为很少出现数据结构不变化（不改需求）的情况

#### UML
![image.png](http://img.masterjoy.top/20190925/a594d0055d41dd4cc245204d71f026ba.png)

#### DEMO 男人和女人
上帝创造了男人，之后又把男人的肋骨拿去创造了女人。总之，这个世界的人就两种性别：男、女。

男人和女人对一些事的看法是不同的，用访问者模式表示

人类抽象
```java
public interface Human {
    void getAdvice(Visitor visitor);
}
```
男人
```java
public class MaleHuman implements Human{

    @Override
    public void getAdvice(Visitor visitor) {
        visitor.advice(this);
    }
}
```
女人
```java
public class FemaleHuman implements Human {

    @Override
    public void getAdvice(Visitor visitor) {
        visitor.advice(this);
    }
}
```
对世间万物的看法抽象
```java
public interface Visitor {

    void advice(MaleHuman man);

    void advice(FemaleHuman female);
}
```
对 花 的看法
```java
public class FlowerVisitor implements Visitor {

    @Override
    public void advice(MaleHuman man) {
        System.out.println(man.getClass().getName());
        System.out.println("约pao工具");
    }

    @Override
    public void advice(FemaleHuman female) {
        System.out.println(female.getClass().getName());
        System.out.println("真爱");
    }
}
```
对 热天 的看法
```java
public class SummerVisitor implements Visitor {

    @Override
    public void advice(MaleHuman man) {
        System.out.println(man.getClass().getName());
        System.out.println("看清凉的妹子");
    }

    @Override
    public void advice(FemaleHuman female) {
        System.out.println(female.getClass().getName());
        System.out.println("穿清凉的衣服");
    }
}
```
对其高层抽象接口
```java
public class Context {

    private List<Human> humans = new ArrayList<>();

    public void add(Human human) {
        humans.add(human);
    }

    public void remove(Human human) {
        humans.remove(human);
    }

    public void act(Visitor visitor) {
        System.out.println();
        System.out.println("关于 " + visitor.getClass().getName() + " 看法");
        for (Human human : humans) {
            human.getAdvice(visitor);
        }
    }
}
```
发表观点
```java
public class Test {

    public static void main(String[] args) {
        Context context = new Context();

        context.add(new MaleHuman());
        context.add(new FemaleHuman());

        Visitor visitor = new SummerVisitor();
        context.act(visitor);

        Visitor visitor2 = new FlowerVisitor();
        context.act(visitor2);
    }
}
```
