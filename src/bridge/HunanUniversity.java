package bridge;

/**
 * 学校实现
 */
public class HunanUniversity extends School {

    @Override
    public void payTuition() {
        for (Class c : clazz) {
            c.callEverbody();
        }
    }
}
