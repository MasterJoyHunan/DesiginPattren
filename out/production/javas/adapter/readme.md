### 适配器模式

#### 模式定义
将一个类的接口转换成客户希望的另外一个接口，使得原本不兼容而不能一起工作的那些类可以一起工作

#### 适用场景
复用一些不太容易修改的类的时候，可以将这些类适配成我们需要的接口

#### UML
![image.png](http://img.masterjoy.top/20190924/46522a0375356e9d35dc29985a546f9f.png)

#### DEMO 翻译
当一个中国人不会说英语和一个美国人谈判的时候，势必会需要一个翻译，否则谈判就会成为鸡同鸭讲故事
```java
public class Chinese {

    public void talk() {
        System.out.println("扁担宽, 板凳长, 中国人说中国话");
    }
}
```
翻译官接口
```java
public interface Adapter {
    void toEnglish();
}
```
实现翻译官
```java
public class HumanAdapter implements Adapter {

    private Chinese chinese = new Chinese();

    @Override
    public void toEnglish() {
        chinese.talk();
        System.out.println("翻译官转换为英语 : ");
        System.out.println("ba la ba la ba la ba la ba la");
    }
}
```
进行谈判
```java
public class Test {

    public static void main(String[] args) {
        Adapter translate = new HumanAdapter();
        translate.toEnglish();
    }
}

```