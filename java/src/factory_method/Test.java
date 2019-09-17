package factory_method;

/**
 * @author joy
 * @time 2019/09/16 19:41
 */
public class Test {
    public static void main(String[] args) {
        OperationFactoryAdd operation = new OperationFactoryAdd();
        Operation addOperate = operation.createOperation();
        addOperate.setNumberA(5.0);
        addOperate.setNumberB(2.0);
        double res = addOperate.calc();
        System.out.println(res);
    }
}
