package simple_factory;

/**
 * @author joy
 * @time 2019/09/03 08:33
 */
public abstract class Operation {
    private double numberA;
    private double numberB;

    double calc() throws RuntimeException {
        return 0.0;
    }

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
