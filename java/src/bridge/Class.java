package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joy
 * @time 2019/09/19 15:05
 */
abstract class Class {

    protected List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public abstract void callEverbody();
}
