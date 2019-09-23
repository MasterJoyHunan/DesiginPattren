package abstract_factory;

/**
 * 抽象工厂模式
 */
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
