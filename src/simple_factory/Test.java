package simple_factory;

/**
 * 工厂实现计算器程序
 */
public class Test {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumberA(1.0);
        operation.setNumberB(2.0);
        double res = operation.calc();
        System.out.println(res);
    }
}
