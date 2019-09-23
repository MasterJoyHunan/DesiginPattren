package vositor;

/**
 * @author joy
 * @time 2019/09/21 14:45
 */
public interface Visitor {

    void advice(MaleHuman man);

    void advice(FemaleHuman female);
}
