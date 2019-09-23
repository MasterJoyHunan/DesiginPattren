package abstract_factory;

/**
 * @author joy
 * @time 2019/09/17 18:45
 */
public interface Department {

    void insert(DepartmentDao departmentDao);

    DepartmentDao get(int id);
}
