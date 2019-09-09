package decorator;

/**
 * @author joy
 * @time 2019/09/07 10:43
 */
public class HonySeasoning extends SeasoningDecorator {

    @Override
    public void addSeasoning() {
        super.addSeasoning();
        System.out.println(" + 蜂蜜");
    }
}
