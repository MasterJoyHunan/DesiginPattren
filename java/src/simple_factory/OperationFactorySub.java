package simple_factory;

/**
 * @author joy
 * @time 2019/09/03 08:40
 */
public class OperationFactorySub implements OperationFactory {

    /**
     * 工厂方法模式
     *
     * @return
     */
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
