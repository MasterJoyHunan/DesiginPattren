package decorator;

/**
 * @author joy
 * @time 2019/09/07 10:46
 */
public class IceSeasoning extends SeasoningDecorator {

    @Override
    public void addSeasoning() {
        super.addSeasoning();
        System.out.println(" + 冰");
    }
}
