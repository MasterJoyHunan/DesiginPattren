### 责任链模式

#### 模式定义
使多个对象都有机会处理请求，从而避免请求发送者和接收者之间的耦合关系，将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止

#### 适用场景
需要随时增加或修改处理一个请求的结构，灵活性给对象指派职责

#### UML
![image.png](http://img.masterjoy.top/20190924/eeee809bcd64fed6e42d0c7cac389e00.png)

#### DEMO 汇报
奴隶小明做了个报告，需要给BOSS看，当然首先得经过组长、CEO、的评审才能让老板过目。
组长、CEO、任何人的否决，则该报告就无法送达至BOSS。

如果将这个过程用程序表达，责任链模式是最好的诠释了。

处理报告的抽象
```java
abstract class ReportHandel {

    protected ReportHandel handel;

    public void setSuccessor(ReportHandel handel) {
        this.handel = handel;
    }

    public abstract void handelRequest(int number);
}
```
奴隶
```java
public class SalveReportHandel extends ReportHandel {

    @Override
    public void handelRequest(int number) {
        System.out.println(SalveReportHandel.class.getName() + " 汇报工作" + number);
        if (handel != null) {
            handel.handelRequest(number);
        }
    }
}
```
组长
```java
public class GroupLeaderReportHandel extends ReportHandel {

    @Override
    public void handelRequest(int number) {
        if (number <= 1) {
            System.out.println(GroupLeaderReportHandel.class.getName() + " 听了汇报,感觉像屎一样,回去重写");
            System.out.println("=============");
            System.out.println();
        } else {
            System.out.println(GroupLeaderReportHandel.class.getName() + "向上级汇报");
            if (handel != null) {
                handel.handelRequest(number);
            }
        }
    }
}
```
CEO
```java
public class CEOReportHandel extends ReportHandel {

    @Override
    public void handelRequest(int number) {
        if (number <= 2) {
            System.out.println(CEOReportHandel.class.getName() + " 听了汇报,感觉像屎一样,回去重写");
            System.out.println("=============");
            System.out.println();
        } else {
            System.out.println(CEOReportHandel.class.getName() + "向上级汇报");
            if (handel != null) {
                handel.handelRequest(number);
            }
        }
    }
}
```
BOSS
```java
public class BossReportHandel extends ReportHandel {

    @Override
    public void handelRequest(int number) {
        if (number <= 3) {
            System.out.println(BossReportHandel.class.getName() + " 这什么狗屁玩意");
        } else  {
            System.out.println(BossReportHandel.class.getName() + " 你真是个天才, 继续努力");
        }

        System.out.println("=============");
        System.out.println();
    }
}
```
鞭策奴隶干活
```java
public class Test {
    public static void main(String[] args) {
        ReportHandel joy = new SalveReportHandel();
        ReportHandel teamLeader = new GroupLeaderReportHandel();
        ReportHandel ceo = new CEOReportHandel();
        ReportHandel boss = new BossReportHandel();

        joy.setSuccessor(teamLeader);
        teamLeader.setSuccessor(ceo);
        ceo.setSuccessor(boss);

        for (int i = 0; i < 5; i++) {
            joy.handelRequest(i);
        }
    }
}
```