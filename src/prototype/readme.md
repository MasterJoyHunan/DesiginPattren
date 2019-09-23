### 原型模式
#### 模式定义
用原型实例自定义创建对象的种类，并且通过拷贝这些原型创建新的对象
#### 适用场景
从一个对象，再创建另一个可定制化的对象，而不需要知道任何创建的细节，而不需要进行初始化一系列的过程

原型模式太常用了，一般现在高级语言都内置了 `clone` 接口或者方法，不需要我们自己实现该模式
#### UML
![image.png](http://img.masterjoy.top/20190923/192d51c2c2af5ef191964160ff056955.png)
#### DEMO
在9012年。人类掌握的克隆人的技术，我们可以克隆很多克隆人帮助自己做很多事
```java
public class HumanClone implements Cloneable {
    private String name;
    private String sex;
    private int age;
    private Job job;


    public HumanClone(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        System.out.println("进行实例化");
    }

    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
```
工厂将我们定制化的克隆人，像下饺子一样一个一个生产出来
```java
public class Test {
    public static void main(String[] args) {
        HumanClone clone  = new HumanClone("joy", "male", 18);
        clone.setJob("看家护院");
        HumanClone clone2 = (HumanClone) clone.clone();
        HumanClone clone3 = (HumanClone) clone.clone();

        clone.setJob("做饭洗碗");
        clone3.setAge(21);

        System.out.println(clone);
        System.out.println(clone2);
        System.out.println(clone3);
    }
}
```