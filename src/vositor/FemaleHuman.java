package vositor;

/**
 * 女人
 */
public class FemaleHuman implements Human {

    @Override
    public void getAdvice(Visitor visitor) {
        visitor.advice(this);
    }
}
