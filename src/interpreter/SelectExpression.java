package interpreter;

/**
 * 查
 */
public class SelectExpression implements SqlExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("select * ......");
    }
}
