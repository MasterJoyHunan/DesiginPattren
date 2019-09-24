package decorator2;


public class IceSeasoning implements SeasoningDecorator {

    @Override
    public void addSeasoning() {
        System.out.println(" + 冰");
    }
}
