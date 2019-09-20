package decorator;

/**
 * @author joy
 * @time 2019/09/07 10:40
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
        seasoning.addSeasoning();
    }
}
