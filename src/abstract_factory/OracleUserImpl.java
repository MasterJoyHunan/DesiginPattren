package abstract_factory;


public class OracleUserImpl implements User {
    @Override
    public void insert(UserDao userDao) {
        System.out.println("使用 oracle 插入 user 数据");
    }

    @Override
    public UserDao get(int id) {
        System.out.println("使用 oracle 查询 user 数据");
        return null;
    }
}
