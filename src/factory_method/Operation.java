package factory_method;

/**
 * 运算抽象类
 */
public abstract class Operation {
    private double numberA;
    private double numberB;

    /**
     * 抽象计算方法
     * @return double
     * @throws RuntimeException
     */
    abstract double calc() throws RuntimeException;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
