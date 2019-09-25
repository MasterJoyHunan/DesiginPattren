package iterator;

/**
 * 迭代器
 */
public interface Iterator {

    /**
     * 转到头
     *
     * @return
     */
    Object rewind();

    /**
     * 下一个
     *
     * @return
     */
    void next();

    /**
     * 判断是否到尾
     *
     * @return
     */
    boolean isDone();

    /**
     * 当前迭代位置
     *
     * @return
     */
    Object current();
}
