package abstract_factory;

/**
 * @author joy
 * @time 2019/09/17 18:42
 */
public interface User {

    void insert(UserDao userDao);

    UserDao get(int id);
}
