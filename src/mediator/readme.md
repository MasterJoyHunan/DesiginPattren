### 中介者模式

#### 模式定义
用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式的相互引用，从而使其耦合松散，而且可以独立的改变他们之间的交互

#### 适用场景
当系统出现了多对多交互复杂对象群时

请勿轻易使用中介者模式，先审视系统设计是否合理。由于mediator控制集中化，与中介者交互的对象的复杂性变成中介者的复杂性，最终导致mediator比任何一个对象都复杂

#### UML
![image.png](http://img.masterjoy.top/20190925/8b60ce58bc6db69018502291bcf27bdf.png)

#### DEMO 汉奸汪精卫
屡次战争中总会有人为了逃避战争，保护自己或家人的安全，做一些的世人唾弃的事。其中是是非非不由我们去审判。这个故事要讲的是
战争中，不管敌方、我方总会派出情报工作人员，打探敌方情报，争取做到知己知彼。

一般情况下，敌我双方不可能直接通信的（互相透露自己的情报）。那获取情报的任务就只能交给情报工作人员（间谍）

情报人员接口
```java
interface Spy {

    /**
     * 发送情报
     * @param msg
     * @param army
     */
    void sendMsg(String msg, Army army);
}
```
汪先生
```java
public class MrWangSpy implements Spy {

    private Army huangJun;
    private Army gongJun;

    public void setHuangJun(Army huangJun) {
        this.huangJun = huangJun;
    }

    public void setGongJun(Army gongJun) {
        this.gongJun = gongJun;
    }

    @Override
    public void sendMsg(String msg, Army army) {
        if (army == huangJun) {
            gongJun.receiveMsg("获取到日军情报 : " + msg);
        } else {
            huangJun.receiveMsg("散布假情报 : " + msg);
        }
    }
}
```
军队抽象
```java
public abstract class Army {

    protected Spy spy;

    public Army(Spy spy) {
        this.spy = spy;
    }

    public void talk(String msg) {
        spy.sendMsg(msg, this);
    }

    public abstract void receiveMsg(String msg);
}
```
共军
```java
public class GongArmy extends Army {

    public GongArmy(Spy spy) {
        super(spy);
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(GongArmy.class.getName() + " 收到信息 : " + msg);
    }
}
```
皇军
```java
public class HuangArmy extends Army {

    public HuangArmy(Spy spy) {
        super(spy);
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(HuangArmy.class.getName() + " 收到信息 : " + msg);
    }
}
```
谍战
```java
public class Test {

    public static void main(String[] args) {
        MrWangSpy wang = new MrWangSpy();

        HuangArmy huang = new HuangArmy(wang);
        GongArmy gong = new GongArmy(wang);

        wang.setGongJun(gong);
        wang.setHuangJun(huang);

        huang.talk("我们要偷袭珍珠港");
        gong.talk("二营长, 你他娘的意大利炮呢");
    }
}
```