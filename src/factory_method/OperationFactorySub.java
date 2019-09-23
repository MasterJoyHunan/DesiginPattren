package factory_method;

/**
 * 减法运算工厂
 */
public class OperationFactorySub implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
