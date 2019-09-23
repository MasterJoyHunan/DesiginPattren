### 工厂方法模式

#### 模式定义
定义一个创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类

#### 适用场景
当使用简单工厂模式满足不了需求的时候。比如：简单工厂如果需要添加 `开方` 的操作的时候，
需要在添加一个操作类继承抽象操作类，并且需要在 `OperationFactory` 里添加一个 `case` 分支
一旦 `switch` 分支过于庞大的时候，且需要频繁的修改的时候，根据需要可以将简单工厂模式重构为工厂方法模式了。

#### UML
![uml](http://img.masterjoy.top/20190923/de35ab51c59cedb9c3c1e79170c998c3.png)

#### DEMO 继续计算器例子

```java
switch (operate) {
    case "+":
        op = new OperationAdd();
        break;
    case "-":
        op = new OperationSub();
        break;
    case :
        ......
        ......
        ......
}
return op;
```
越来越多的 `case` 将难以维护，所以需要寻找更优雅的模式，此时可以将简单工厂模式
重构为 `工厂方法模式` OR `抽象工厂模式`，经过慎重考虑过后（瞎掰的），我觉得工厂方法模式更适合当当前场景

1.运算抽象类不变
2.修改 OperationFactory 为接口
```java
interface OperationFactory {

    /**
     * 工厂方法模式
     *
     * @return Operation
     */
    Operation createOperation();
}
```
3.添加 加法运算工厂、减法运算工厂 返回 运算实例
```java
public class OperationFactoryAdd implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}

public class OperationFactorySub implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
```
测试方法
```java
public class Test {
    public static void main(String[] args) {
        OperationFactory operation  = new OperationFactoryAdd();
        Operation        addOperate = operation.createOperation();
        addOperate.setNumberA(5.0);
        addOperate.setNumberB(2.0);
        double res = addOperate.calc();
        System.out.println(res);
    }
}
```