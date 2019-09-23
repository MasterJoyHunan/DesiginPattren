### 单例模式
#### 模式定义
保证一个类仅有一个实例，并提供一个访问它全局访问点
#### 适用场景
不需要重复实例化的类，如配置文件类，工具类
#### DEMO 
```java
public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
```
这应该是设计模式里最简单的设计模式了