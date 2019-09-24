### 状态模式

#### 模式定义
当一个对象的内在状态改变时允许改变其行为，这个对象看起来像改变了其类

#### 适用场景
当一个对象状态转换的条件表达式过于复杂时，把状态的判断交给一系列的类，将复杂逻辑简单化

减少if/else switch的困扰

#### UML
![image.png](http://img.masterjoy.top/20190924/c7600382173f182b341e05b40f4be569.png)

#### DEMO 根据省市区编码，判断属于哪个城市
中国省市区街道编码最多为9位数，根据任意一个编码，判断其省市区

注：省为2位数，市为4位数，县区为6为数，最简单的办法为
```java
String areaCode = "43";
if(areaCode.length() == 2) {
    // 省
} else if(areaCode.length() == 4) {
    // 市
} else if (areaCode.length() == 6) {
    // 区
} else if( areaCode.length() == 9) {
    // 街道
} else {
    throw new Exception();
}
```
这里处理相对简单，但是其他项目可能有更加冗长的代码，导致阅读和维护困难。
那么这样的代码就需要重构为状态模式

状态上下文
```java
public class AreaCodeContext {

    private State state;
    private int   areaCode;

    public AreaCodeContext() {
        this.state = new ProvinceState();
    }

    public void belong() {
        state.auth(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getAreaCode() {
        return Integer.toString(areaCode);
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }
}
```
状态抽象
```java
public interface State {

    void auth(AreaCodeContext context);
}

```
省
```java
public class ProvinceState implements State {

    @Override
    public void auth(AreaCodeContext context) {
        if (context.getAreaCode().length() == 2) {
            System.out.println("我是省");
        } else {
            context.setState(new CityState());
            context.belong();
        }
    }
}
```
市
```java
public class CityState implements State {

    @Override
    public void auth(AreaCodeContext context) {
        if (context.getAreaCode().length() == 4) {
            System.out.println("我是市");
        } else {
            context.setState(new AreaState());
            context.belong();
        }
    }
}
```
区
```java
public class AreaState implements State {

    @Override
    public void auth(AreaCodeContext context) {
        if (context.getAreaCode().length() == 6) {
            System.out.println("我是区");
        } else {
            context.setState(new StreetState());
            context.belong();
        }
    }
}
```
街道
```java
public class StreetState implements State {

    @Override
    public void auth(AreaCodeContext context) {
        if (context.getAreaCode().length() == 9) {
            System.out.println("我是街道");
        } else {
            throw new IllegalArgumentException("areaCode 非法");
        }
    }
}
```
测试
```java
public class Test {

    public static void main(String[] args) {
        AreaCodeContext context = new AreaCodeContext();
        context.setAreaCode(43);
        context.belong();
    }
}
```