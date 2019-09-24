package decorator2;

public class HonySeasoning implements SeasoningDecorator {

    @Override
    public void addSeasoning() {
        System.out.println(" + 蜂蜜");
    }
}
