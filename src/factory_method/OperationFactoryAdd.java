package factory_method;

/**
 * 加法运算工厂
 */
public class OperationFactoryAdd implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
