package iterator;

/**
 * 迭代实现
 */
public class ClassmateIterator implements Iterator {

    private Student[] students;
    private int       index = 0;

    public ClassmateIterator(Student[] students) {
        this.students = students;
    }

    /**
     * 转到头
     *
     * @return
     */
    @Override
    public Object rewind() {
        index = 0;
        return students[index];
    }

    /**
     * 下一个
     *
     * @return
     */
    @Override
    public void next() {
        index++;
    }

    /**
     * 判断是否到尾
     *
     * @return
     */
    @Override
    public boolean isDone() {
        if (current() == null || this.students.length == index) {
            return true;
        }
        return false;
    }

    /**
     * 当前迭代位置
     *
     * @return
     */
    @Override
    public Object current() {
        return students[index];
    }
}
