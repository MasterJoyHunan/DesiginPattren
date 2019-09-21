package interpreter;

/**
 * @author joy
 * @time 2019/09/21 11:46
 */
public class DeleteExpression implements SqlExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("delete ....");
    }
}
