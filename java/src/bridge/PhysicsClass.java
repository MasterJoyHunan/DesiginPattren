package bridge;

/**
 * @author joy
 * @time 2019/09/19 15:14
 */
public class PhysicsClass extends Class {

    @Override
    public void callEverbody() {
        for (Student student: students) {
            student.payTuition();
        }
    }
}
