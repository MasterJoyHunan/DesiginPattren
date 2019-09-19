package singleton;

/**
 * 单例
 *
 * @author joy
 * @time 2019/09/19 13:44
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


}
