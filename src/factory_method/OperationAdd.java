package factory_method;

/**
 * 加法运算类
 */
public class OperationAdd extends Operation {

    @Override
    double calc() {
        return this.getNumberA() + this.getNumberB();
    }
}
