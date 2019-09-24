### 享元模式

#### 模式定义
运用共享技术有效的支持大量细粒度的对象

#### 适用场景
大量细粒度实例仅几个参数以外基本上是相同的。那么就可以通过享元模式大幅度减少实例的数目，有点像单例模式

#### UML
![image.png](http://img.masterjoy.top/20190924/7ff0c704610340767c6e6118ce172317.png)

#### DEMO 去食堂吃饭
奴隶们饿了话，就得去食堂吃饭吧。食堂提供两个菜，青菜和一片兰州拉面里面的牛肉。
可以想象的得到，食堂可不是小灶。青菜肯定同一个锅里出来的。至于牛肉嘛，反正也是同一个地方采购的。

用程序表示青菜不是每个人单独炒的话，用享元模式表示

食物抽象
```java
public interface Flyweight {
    void giveFood(Slave joy);
}
```
青菜
```java
public class Greens implements Flyweight {

    @Override
    public void giveFood(Slave joy) {
        System.out.println("提供青菜" + joy + " eat");
    }
}
```
牛肉片
```java
public class Steak implements Flyweight {

    @Override
    public void giveFood(Slave joy) {
        System.out.println("提供牛排" + joy + " eat");
    }
}
```
食堂打菜阿姨
```java
public class FlyweightFactory {

    private static Map<String, Flyweight> map = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            Flyweight flyweight = null;
            try {
                flyweight = (Flyweight) Class.forName(key).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            map.put(key, flyweight);
            return flyweight;
        }
    }
}
```
我和你
```java
public class Slave {
    private String name;
    public Slave(String name) {
        this.name = name;
    }
}
```
下班咯，去食堂吃饭去咯
```java
public class Test {

    public static void main(String[] args) {

        Flyweight steak1 = FlyweightFactory.getFlyweight(Steak.class.getName());
        steak1.giveFood(new Slave("master"));

        Flyweight steak2 = FlyweightFactory.getFlyweight(Steak.class.getName());
        steak2.giveFood(new Slave("joy"));

        Flyweight greens1 = FlyweightFactory.getFlyweight(Greens.class.getName());
        greens1.giveFood(new Slave("bobo"));

        Flyweight greens2 = FlyweightFactory.getFlyweight(Greens.class.getName());
        greens2.giveFood(new Slave("jack"));
    }
}
```