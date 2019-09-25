package vositor;


public class Test {

    public static void main(String[] args) {
        Context context = new Context();

        context.add(new MaleHuman());
        context.add(new FemaleHuman());

        Visitor visitor = new SummerVisitor();
        context.act(visitor);

        Visitor visitor2 = new FlowerVisitor();
        context.act(visitor2);

    }
}
