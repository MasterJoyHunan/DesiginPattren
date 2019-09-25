package iterator;

/**
 * 聚集对象容器
 */
public class ClassMate implements Aggregate {

    private Student[] students;
    private int       size = 0;

    public ClassMate(int capacity) {
        students = new Student[capacity];
    }

    public void add(Student student) {
        students[size] = student;
        size++;
    }


    /**
     * 返回迭代器
     *
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new ClassmateIterator(students);
    }
}
