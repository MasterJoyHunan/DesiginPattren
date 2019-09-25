package vositor;

/**
 * 算法
 * -- 鲜花
 */
public class FlowerVisitor implements Visitor {

    @Override
    public void advice(MaleHuman man) {
        System.out.println(man.getClass().getName());
        System.out.println("约pao工具");
    }

    @Override
    public void advice(FemaleHuman female) {
        System.out.println(female.getClass().getName());
        System.out.println("真爱");
    }
}
