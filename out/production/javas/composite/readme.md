### 组合模式

#### 模式定义
将对象组合成树形结构以表示‘部分’-‘整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性

#### 适用场景
需求中含有树型结构，且树型结构节点大致相同。我们就应该忽略每个节点的不同，抽象为组合模式

#### UML
![image.png](http://img.masterjoy.top/20190924/0c2c027d14057b45fcf383559cfc9c70.png)

#### DEMO 周扒皮
这里讲一个周扒皮故事。在中国找工作的时候，你会发现很多老板希望多做事，多加班，少拿钱，还喂你鸡汤，尽可能的剥削员工。
导致现在找工作的人都说找工作（好工作）太难了，老板也在说招人（便宜，听话，经验丰富）太难了。。。。。。

这里用代码表示一下，老板、领导、奴隶。老板管领导，领导管奴隶。

老板、领导、奴隶都可以抽象出来一个公用类，雇员
```java
abstract class Employee {

    public abstract void add(Employee employee);

    public abstract void remove(Employee employee);

    public abstract void display(int dept);
}
```
老板和领导都是可以管理别人,可以划分为一类
```java
public class Leader extends Employee {

    List<Employee> employees = new ArrayList<>();

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }


    @Override
    public void display(int dept) {
        for (int i = 0; i < dept; i++) {
            System.out.print("----");
        }
        System.out.println(" 不干活, 功劳都是领导的 ");
        for (Employee employee :
                employees) {
            employee.display(dept + 1);
        }
    }
}
```
奴隶嘛，只要干不死，就往死里干
```java
public class Slave extends Employee {

    @Override
    public void add(Employee employee) {}

    @Override
    public void remove(Employee employee) {}

    @Override
    public void display(int dept) {
        for (int i = 0; i < dept; i++) {
            System.out.print("----");
        }
        System.out.println(" 奴隶使劲干活, 功劳都是领导的 ");
    }
}
```
给大家演示一下
```java
public class Test {

    public static void main(String[] args) {
        Employee boss = new Leader();
        Employee wife_boos = new Slave();

        Employee CEO = new Leader();
        Employee CTO = new Leader();

        boss.add(wife_boos);
        boss.add(CEO);
        boss.add(CTO);

        Employee CEO_SALVE_1= new Slave();
        Employee CEO_SALVE_2 = new Slave();

        CEO.add(CEO_SALVE_1);
        CEO.add(CEO_SALVE_2);

        Employee CTO_SALVE_1= new Slave();
        Employee CTO_SALVE_2 = new Slave();

        CTO.add(CTO_SALVE_1);
        CTO.add(CTO_SALVE_2);

        System.out.println(boss);
        boss.display(0);
    }
}

```