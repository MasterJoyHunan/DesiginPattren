### 模板方法模式

#### 模式定义
定义一个操作中算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤

#### 适用场景
把不变的行为搬移到超类，去除子类中重复代码，提供很好的代码复用平台

#### DEMO 组装电脑
很多人都知道电脑是由什么组成的，主板、CPU、内存、显卡等等。但是用途不同，电脑所需要的配置就不同。
家用电脑组装过程都是一样的，所以组装过程我们可以抽象出超类。其他配置我们可以由子类实现

组装过程
```java
abstract class ComputeTemplate {

    public abstract void installCpu();
    public abstract void installBoard();
    public abstract void installMemory();
    public abstract void installGraphicsCard();
    public abstract void installPower();

    public void installCompute() {
        System.out.println("组装电脑");
        installCpu();
        installBoard();
        installMemory();
        installGraphicsCard();
        installPower();
        System.out.println("组装完毕, 开始点亮开机");
    }
}
```
家用电脑
```java
public class MicrocomputerTemplate extends ComputeTemplate {

    @Override
    public void installCpu() {
        System.out.println("i5 2450");
    }

    @Override
    public void installBoard() {
        System.out.println("技嘉 A130");
    }

    @Override
    public void installMemory() {
        System.out.println("金士顿 16G");
    }

    @Override
    public void installGraphicsCard() {
        System.out.println("GTX 1080");
    }

    @Override
    public void installPower() {
        System.out.println("杂牌电源 1200W");
    }
}
```
神威-太湖之光
```java
public class SuperComputeTemplate extends ComputeTemplate {

    @Override
    public void installCpu() {
        System.out.println("组装N个CPU");
    }

    @Override
    public void installBoard() {
        System.out.println("组装N个主板");
    }

    @Override
    public void installMemory() {
        System.out.println("组装N个内存");
    }

    @Override
    public void installGraphicsCard() {
        System.out.println("组装N个显卡");
    }

    @Override
    public void installPower() {
        System.out.println("组装N个电源");
    }

}
```
开始组装
```java
public class Test {

    public static void main(String[] args) {
        ComputeTemplate shenwei = new SuperComputeTemplate();
        shenwei.installCompute();

        ComputeTemplate game = new MicrocomputerTemplate();
        game.installCompute();
    }
}
```
