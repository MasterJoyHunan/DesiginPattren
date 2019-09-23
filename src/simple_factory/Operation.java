package simple_factory;

/**
 * 抽象操作类，所有操作继承该父类
 */
public abstract class Operation {
    private double numberA;
    private double numberB;

    /**
     * 进行运算
     *
     * @return double
     * @throws RuntimeException
     */
    abstract double calc() throws RuntimeException ;

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
