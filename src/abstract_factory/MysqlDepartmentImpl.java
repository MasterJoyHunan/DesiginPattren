package abstract_factory;


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
