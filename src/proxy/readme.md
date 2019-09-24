### 代理模式

#### 模式定义
为其他对象提供一种代理已控制对这个对象的访问

#### 适用场景
一个对象不容易进行修改，而须对该对象进行控制的时候

#### UML
![image.png](http://img.masterjoy.top/20190924/9d93426018ae1e7f877aaaf7606bb5ea.png)

#### DEMO 租客找房子
租客一般都是通过代理找房子，因为代理手上房子多，可以立马去看房，如果价格合适，他们直接可以代表房东和你签合同

租客和中介的抽象
```java
interface Proxy {
    void findHouse();
}
```
租客
```java
public class Tanant implements Proxy {
    @Override
    public void findHouse() {
        System.out.println(name + " 找房子");
    }
}
```
中介
```java
public class HouseProxy implements Proxy {

    private Tanant xiaoming;

    public HouseProxy(Tanant xiaoming) {
        this.xiaoming = xiaoming;
    }

    @Override
    public void findHouse() {
        xiaoming.findHouse();
        System.out.println("代理帮 " + xiaoming.getName() + " 找房子");
    }
}
```
模拟找房子
```java
public class Test {
    public static void main(String[] args) {
        Proxy anjvke = new HouseProxy(new Tanant("小明"));
        anjvke.findHouse();
    }
}
```