### 外观模式

#### 模式定义
为子系统提供一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用

#### 适用场景
封装某一个类，或一系列类的方法，隐藏其复杂的逻辑。暴露出简单接口

#### UML
![image.png](http://img.masterjoy.top/20190924/8a4ca7f406bfa1123ff14dd5738fc2da.png)

#### DEMO ATM机上取钱
虽然现在手机支付很方便，但是大家或多或少都去过ATM机取钱过。
取钱的过程很简单，插卡、输密码、输入金额、取钱、取卡。其实ATM机系统还做了很多事。
比如核对密码、把你取钱的视频监控起来、对你账户的余额加减等等。

但是这些操作都是对你隐藏的，所以你并不需要这些东西是怎么运行的。这就是外观模式的典型应用

ATM机
```java
public class Facade {

    private MonitorSystem  monitor = new MonitorSystem();
    private SecuritySystem security = new SecuritySystem();
    private PrintSystem    print = new PrintSystem();

    public void getMoney(String pwd) {
        monitor.monitor();
        security.checkPwd(pwd);
        print.print();
    }
}
```
监控系统
```java
public class MonitorSystem {

    public void monitor() {
        System.out.println("监控人取钱, 以作备案");
    }
}
```
安全系统
```java
public class SecuritySystem {

    public void checkPwd(String pwd) {
        System.out.println("检查密码是否正确");
        if ("123456".equals(pwd)) {
            System.out.println("密码正确");
        } else {
            System.out.println("密码错误");
        }
    }
}
```
打印系统
```java
public class PrintSystem {

    public void print() {
        System.out.println("打印凭证");
    }
}
```
取钱操作
```java
public class Test {

    public static void main(String[] args) {
        Facade getMoney = new Facade();
        getMoney.getMoney("123456");
    }
}
```