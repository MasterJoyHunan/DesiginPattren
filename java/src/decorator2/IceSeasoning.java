package decorator2;

/**
 * @author joy
 * @time 2019/09/07 10:46
 */
public class IceSeasoning implements SeasoningDecorator {

    @Override
    public void addSeasoning() {
        System.out.println(" + 冰");
    }
}
