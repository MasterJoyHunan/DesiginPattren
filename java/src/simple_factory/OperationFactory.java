package simple_factory;


/**
 * 简单工厂模式
 * @author joy
 * @time 2019/09/03 08:41
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation op = null;
        switch (operate) {
            case "+":
                op = new OperationAdd();
                break;
            case "-":
                op = new OperationSub();
                break;
            case "*":
                break;
            case "/":
                break;
        }
        return op;
    }
}
