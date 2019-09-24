package interpreter;

/**
 * 删
 */
public class DeleteExpression implements SqlExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("delete ....");
    }
}
