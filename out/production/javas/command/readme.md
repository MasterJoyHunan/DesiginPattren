### 命令模式
#### 模式定义
将一个请求封装为一个对象，从而使你可以用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及可撤销操作

#### 适用场景
将一个请求对象和执行对象分离开来

#### UML
![image.png](http://img.masterjoy.top/20190924/624644a8c0059419a62c09208964228d.png)

#### DEMO 上级命令下级
周扒皮总会有一些坏点子。比如，在下班的时候下达一个指示，要你加班而从来不给加班费

周扒皮
```java
public class Leader {

    private List<Command> command = new ArrayList<>();

    public void setCommand(Command command) {
        this.command.add(command);
    }

    public void advise() {
        for (Command com : command) {
            com.exec(Leader.class.getName());
        }
        command.clear();
    }
}
```
命令抽象
```java
abstract class Command {

    protected List<Developer> developers = new ArrayList<>();

    public void add(Developer developer) {
        developers.add(developer);
    }

    public abstract void exec(String command);
}
```
上班命令
```java
public class WorkCommand extends Command {

    @Override
    public void exec(String command) {
        for (Developer dev : developers) {
            dev.work(command);
        }
    }
}
```
下班命令
```java
public class LifeCommand extends Command {

    @Override
    public void exec(String command) {
        for (Developer dev : developers) {
            dev.life(command);
        }
    }
}
```
执行者，奴隶们
```java
public class Developer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(String some) {
        System.out.println(name + "上班时间, 努力工作");
    }

    public void life(String some) {
        System.out.println(name + "下班时间, 加班工作......");
    }
}
```
演示
```java
public class Test {

    public static void main(String[] args) {
        Leader    leader = new Leader();
        Developer joy    = new Developer();
        joy.setName("joy");
        Developer bobo   = new Developer();
        bobo.setName("bobo");
        Command work = new  WorkCommand();
        Command life = new LifeCommand();

        work.add(joy);
        work.add(bobo);

        life.add(joy);
        life.add(bobo);


        leader.setCommand(work);
        leader.setCommand(work);
        leader.advise();
        System.out.println("下班时间到......");
        leader.setCommand(life);
        leader.advise();
    }
}
```


