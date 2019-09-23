package abstract_factory;

/**
 * 部门服务类
 */
public interface Department {

    void insert(DepartmentDao departmentDao);

    DepartmentDao get(int id);
}
