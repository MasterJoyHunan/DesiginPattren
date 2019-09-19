package bridge;

/**
 * @author joy
 * @time 2019/09/19 15:06
 */
public class HunanUniversity extends School {

    @Override
    public void payTuition() {
        for (Class c : clazz) {
            c.callEverbody();
        }
    }
}
