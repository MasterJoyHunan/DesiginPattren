package abstract_factory;

/**
 * @author joy
 * @time 2019/09/17 18:45
 */
public class MysqlDepartmentImpl implements Department {

    @Override
    public void insert(DepartmentDao departmentDao) {
        System.out.println("使用 mysql 插入 department 数据");
    }

    @Override
    public DepartmentDao get(int id) {
        System.out.println("使用 mysql 插入 department 数据");
        return null;
    }
}
