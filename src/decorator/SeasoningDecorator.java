package decorator;

/**
 * 装饰器抽象
 */
public class SeasoningDecorator implements Seasoning {

    private Seasoning seasoning;

    public SeasoningDecorator() {
    }

    public SeasoningDecorator(Seasoning seasoning) {
        this.seasoning = seasoning;
    }

    public void setSeasoning(Seasoning seasoning) {
        this.seasoning = seasoning;
    }

    @Override
    public void addSeasoning() {
        if (seasoning != null) {
            seasoning.addSeasoning();
        }
    }
}
