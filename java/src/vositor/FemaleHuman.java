package vositor;

/**
 * @author joy
 * @time 2019/09/21 14:54
 */
public class FemaleHuman implements Human {

    @Override
    public void getAdvice(Visitor visitor) {
        visitor.advice(this);
    }


}
