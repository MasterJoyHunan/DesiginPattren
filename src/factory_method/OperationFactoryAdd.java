package factory_method;

/**
 * @author joy
 * @time 2019/09/03 08:36
 */
public class OperationFactoryAdd implements OperationFactory {

    /**
     * 工厂方法模式
     *
     * @return
     */
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
