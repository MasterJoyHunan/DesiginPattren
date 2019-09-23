package simple_factory;


/**
 * 简单工厂模式
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
                // same thing ...
                break;
            case "/":
                // same thing ...
                break;
        }
        return op;
    }
}
