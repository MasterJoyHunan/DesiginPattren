package factory_method;

/**
 * 减法运算类
 */
public class OperationSub extends Operation {

    @Override
    double calc() {
        return this.getNumberA() - this.getNumberB();
    }
}
