package abstract_factory;

/**
 * @author joy
 * @time 2019/09/17 18:48
 */
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
