### 简单工厂模式
#### 模式定义
在简单工厂模式中，可以根据参数的不同返回不同类的实例。简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
#### 适用场景
适用于创建的对象较少，工厂方法中的业务逻辑不太复杂的情况。
#### UML
![image.png](http://img.masterjoy.top/20190923/85dc50d0ba91f568fd1d32d1376414af.png)
#### DEMO 《计算器的实现》
模拟计算器加减乘除，根据用户输入的运算符对两个数字进行计算
如果用面向过程实现， 操作如下
```java
public class BadExample {
    public static void main(String[] args) throws Exception {
        double  numberA   = 1;
        double  numberB   = 2;
        double  res;
        Scanner s         = new Scanner(System.in);
        String  operation = s.nextLine();
        if ("+".equals(operation)) {
            res = numberA + numberB;
        } else if ("-".equals(operation)) {
            res = numberA - numberB;
        } else if ("*".equals(operation)) {
            res = numberA * numberB;
        } else if ("/".equals(operation)) {
            res = numberA / numberB;
        } else {
            throw new Exception();
        }
        System.out.println(res);
    }
}
``` 
以上例子没有使用面向对象编程，实际使用中，无法对这样的代码进行很方便的扩展，比如我需要添加取余 `%` 运算，则需要更改源代码，不符合开闭原则

当我们使用面向对象的时候：就可以对重复的东西进行抽象，比如运算类
```java
public abstract class Operation {
    private double numberA;
    private double numberB;

    double calc() throws RuntimeException {
        return 0.0;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

}

```
`加法运算` 只需继承运算抽象类，然后实现加法的操作即可
```java

public class OperationAdd extends Operation {

    @Override
    double calc() {
        return this.getNumberA() + this.getNumberB();
    }
}

```
减法、乘法、除法、取余 都可以通过继承运算抽象类进行扩展

如果每次运算的时候都 `new` 一个运算对象出来，对我们程序员来说，是不够优雅的，学会简单工厂模式，我们可以创建一个工厂，工厂帮我实例化对象，这样就简化了我们的代码量
```java
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation op = null;
        switch (operate) {
            case "+":
                op = new OperationAdd();
                break;
            case "-":
                op = new OperationSub();
                break;
            case "*":
                // same thing ...
                break;
            case "/":
                // same thing ...
                break;
        }
        return op;
    }
}
```

重新改写我们的测试方法。看，优雅多了
```java
public class Test {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumberA(1.0);
        operation.setNumberB(2.0);
        double res = operation.calc();
        System.out.println(res);
    }
}
```