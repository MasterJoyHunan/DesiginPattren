package vositor;

/**
 * 算法抽象
 */
public interface Visitor {

    void advice(MaleHuman man);

    void advice(FemaleHuman female);
}
