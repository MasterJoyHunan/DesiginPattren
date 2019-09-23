package abstract_factory;

/**
 * 用户服务类
 */
public interface User {

    void insert(UserDao userDao);

    UserDao get(int id);
}
