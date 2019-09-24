package bridge;

/**
 * 班级实现
 */
public class PhysicsClass extends Class {

    @Override
    public void callEverbody() {
        for (Student student: students) {
            student.payTuition();
        }
    }
}
