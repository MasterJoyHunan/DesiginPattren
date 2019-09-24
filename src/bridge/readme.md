### 桥接模式

#### 模式定义
将抽象部分与它的实现部分分离，使它们可以独立的变化

#### 适用场景
实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们之间的耦合。

桥接模式是合成/聚合复用原则的实现

#### UML
![image.png](http://img.masterjoy.top/20190924/6052ac1a395da8660890ef7b2ba55cd5.png)

#### DEMO 学校、班级、学生三者的关系
学校包含了班级和学生，这是不争的事实，但是在程序表示，学校这个类是否需要班级和学生一起作为属性呢？
这显然违反了合成/聚合复用原则。而最佳实践为：学校是独立的，班级是独立的，学生是独立的。
其三者任何一方变化都不会影响其两方。也可以根据需要对任意一方进行扩展

学校方抽象
```java
abstract class School {

    protected List<Class> clazz = new ArrayList<>();

    public void setClazz(Class clazz) {
        this.clazz.add(clazz);
    }

    public abstract void payTuition();
}
```
学校方实现 （湖南大学）
```java
public class HunanUniversity extends School {

    @Override
    public void payTuition() {
        for (Class c : clazz) {
            c.callEverbody();
        }
    }
}
```
班级抽象
```java
abstract class Class {

    protected List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public abstract void callEverbody();
}
```
班级实现 （物理班）
```java
public class PhysicsClass extends Class {

    @Override
    public void callEverbody() {
        for (Student student: students) {
            student.payTuition();
        }
    }
}
```
学生实现
```java
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void payTuition() {
        System.out.println(this + " pay him self tuition");
    }
}
```
学校开学，要所有学生付学费
```java
public class Test {

    public static void main(String[] args) {
        School hndx = new HunanUniversity();

        Class class1 = new PhysicsClass();
        Class class2 = new PhysicsClass();

        Student student1 = new Student("A");
        Student student2 = new Student("B");
        Student student3 = new Student("C");
        Student student4 = new Student("D");

        hndx.setClazz(class1);
        hndx.setClazz(class2);

        class1.add(student1);
        class1.add(student2);

        class2.add(student3);
        class2.add(student4);

        hndx.payTuition();
    }
}
```
