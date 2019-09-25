package vositor;

/**
 * 男人
 */
public class MaleHuman implements Human{

    @Override
    public void getAdvice(Visitor visitor) {
        visitor.advice(this);
    }
}
