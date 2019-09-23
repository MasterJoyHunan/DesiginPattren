package vositor;

/**
 * @author joy
 * @time 2019/09/21 14:47
 */
public class SummerVisitor implements Visitor {

    @Override
    public void advice(MaleHuman man) {
        System.out.println(man.getClass().getName());
        System.out.println("看清凉的妹子");
    }

    @Override
    public void advice(FemaleHuman female) {
        System.out.println(female.getClass().getName());
        System.out.println("穿清凉的衣服");
    }

}
