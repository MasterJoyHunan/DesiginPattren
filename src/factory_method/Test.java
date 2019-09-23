package factory_method;

public class Test {
    public static void main(String[] args) {
        OperationFactory operation  = new OperationFactoryAdd();
        Operation        addOperate = operation.createOperation();
        addOperate.setNumberA(5.0);
        addOperate.setNumberB(2.0);
        double res = addOperate.calc();
        System.out.println(res);
    }
}
