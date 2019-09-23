### 抽象工厂模式

#### 模式定义
提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类

#### 适用场景
当简单工厂不能满足系统的演化时，或涉及到多个产品系列。该模式最大的好处在于：
易于交换产品，可配置

#### UML
![image.png](http://img.masterjoy.top/20190923/3f357844b1739e777962a7d186d48ce0.png)

#### DEMO 数据库访问的例子
我们做 `ORM` 时，将对象会映射成SQL。如一个简单的MYSQL插入，读取操作
```java
public class UserDao {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```
```java
public interface User {

    void insert(UserDao userDao);

    UserDao get(int id);
}
```

```java
public class MysqlUserImpl implements User {
    @Override
    public void insert(UserDao userDao) {
        System.out.println("使用 mysql 插入 user 数据");
    }

    @Override
    public UserDao get(int id) {
        System.out.println("使用 mysql 查询 user 数据");
        return null;
    }
}
```
```java
public class Test {

    public static void main(String[] args) {
        User user = new MysqlUserImpl();
        user.insert(new UserDao());
        user.get(2);
    }
}
```

这样玩在一般情况下是没问题的。但世事无绝对, 突然有一天，客户需要将 `MYSQL` 换成 `Oracle` 那你该怎么办呢？
你可能会新增一个 `OracleUserImpl` , 接着你需要改调用 `User user = new MysqlUserImpl()` 的地方
为 `User user = new OracleUserImpl()`，这里仅仅是 `User` 表受到影响，可现实世界一个库肯定不只一张表
。如此如此这般，大家都会觉得累

如果你学习了抽象工厂模式，情况可能就不太一样了，我们把数据库访问抽象出来
```java
public class DbAbstractFactory {

    private final static String configDb = "abstract_factory.Mysql";

    public static User createUser() {
        Class mClass;
        User user;
        try {
            mClass = Class.forName(configDb + "UserImpl");
            user = (User) mClass.newInstance();
        } catch (Exception e) {
            return null;
        }
        return user;
    }

    public static Department createDepartment() {
        Class mClass;
        Department department;
        try {
            mClass = Class.forName(configDb + "DepartmentImpl");
            department = (Department) mClass.newInstance();
        } catch (Exception e) {
            return null;
        }
        return department;
    }
}
```
然后在你需要可能使用不同数据库访问地方
```java
public class Test {

    public static void main(String[] args) {
        User user = DbAbstractFactory.createUser();
        user.insert(new UserDao());
        user.get(2);

        Department department = DbAbstractFactory.createDepartment();
        department.insert(new DepartmentDao());
        department.get(2);
    }
}
```