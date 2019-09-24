package decorator;

/**
 * 加蜂蜜
 */
public class HonySeasoning extends SeasoningDecorator {

    @Override
    public void addSeasoning() {
        super.addSeasoning();
        System.out.println(" + 蜂蜜");
    }
}
