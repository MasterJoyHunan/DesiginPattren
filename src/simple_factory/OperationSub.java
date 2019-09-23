package simple_factory;

/**
 * 减法操作
 */
public class OperationSub extends Operation {

    @Override
    double calc() {
        return this.getNumberA() - this.getNumberB();
    }
}
