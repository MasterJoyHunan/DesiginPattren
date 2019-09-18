package abstract_factory;

/**
 * @author joy
 * @time 2019/09/17 19:52
 */
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
