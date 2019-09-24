package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 班级抽象 班级聚合多个学生
 */
abstract class Class {

    protected List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
    }

    public abstract void callEverbody();
}
