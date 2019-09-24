### 观察者模式
#### 模式定义
定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有的观察者对象，使他们能够自动更新自己

#### 适用场景
当一个对象的改变需要同时需要改变其他对象

#### UML
![image.png](http://img.masterjoy.top/20190924/511ede487064650a3aa835c9b13491e1.png)

#### DEMO 订购牛奶
我们在牛奶公司业务员那订购了牛奶。公司承诺，每天早上会送一瓶当日鲜奶到邮箱，
并发送一条信息到你的手机。很显然，在订购牛奶这件事上，你显然是订阅者。牛奶送到你邮箱后，
发送一个通知，这显然是通知者，如何用代码表示呢

通知者抽象
```java
interface Notice {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObserver(String notice);
}

```
订阅者抽象
```java
interface Observer {
    void update();
}
```
牛奶供应商
```java
public class MilkProvider implements Notice {

    List<Observer> list = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver(String notice) {
        for (Observer obj: list) {
            obj.update();
        }
    }
}
```
穷人家的孩子
```java
public class PoorBoyObserver implements Observer {
    @Override
    public void update() {
        System.out.println("穷人家的孩子 把牛奶喝了");
    }
}
```
富人家的孩子
```java
public class RichBoyObserver implements Observer {

    @Override
    public void update() {
        System.out.println("有钱人家的孩子用牛奶洗脸");
    }
}
```
牛奶到
```java
public class Test {

    public static void main(String[] args) {
        Notice milk = new MilkProvider();
        Observer richBoy = new RichBoyObserver();
        Observer poorBoy = new PoorBoyObserver();

        milk.attach(richBoy);
        milk.attach(poorBoy);
        milk.notifyObserver("牛奶送到");
    }
}
```