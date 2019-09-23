package abstract_factory;


public class OracleDepartmentImpl implements Department {
    @Override
    public void insert(DepartmentDao userDao) {
        System.out.println("使用 oracle 插入 department 数据");
    }

    @Override
    public DepartmentDao get(int id) {
        System.out.println("使用 oracle 查询 department 数据");
        return null;
    }
}
