package factory_method;

/**
 * 工厂方法接口
 */
interface OperationFactory {

    /**
     * 工厂方法模式
     *
     * @return Operation
     */
    Operation createOperation();
}
