package simple_factory;

/**
 * 计算器程序
 */
public class Test {
    public static void main(String[] args) {
        double numberA = 1;
        double numberB = 2;

        OperationFactory factory = new OperationFactoryAdd();
        Operation operation = factory.createOperation();
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        double res = operation.calc();
        System.out.println(res);
    }
}
