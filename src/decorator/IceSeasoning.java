package decorator;

/**
 * 加冰
 */
public class IceSeasoning extends SeasoningDecorator {

    @Override
    public void addSeasoning() {
        super.addSeasoning();
        System.out.println(" + 冰");
    }
}
