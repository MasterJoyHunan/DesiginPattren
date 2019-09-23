package abstract_factory;


public class MysqlUserImpl implements User {
    @Override
    public void insert(UserDao userDao) {
        System.out.println("使用 mysql 插入 user 数据");
    }

    @Override
    public UserDao get(int id) {
        System.out.println("使用 mysql 查询 user 数据");
        return null;
    }
}
