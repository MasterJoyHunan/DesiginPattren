package vositor;

/**
 * @author joy
 * @time 2019/09/21 14:52
 */
public class MaleHuman implements Human{

    @Override
    public void getAdvice(Visitor visitor) {
        visitor.advice(this);
    }
}
