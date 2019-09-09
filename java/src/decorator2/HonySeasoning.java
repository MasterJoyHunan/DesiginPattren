package decorator2;

/**
 * @author joy
 * @time 2019/09/07 10:43
 */
public class HonySeasoning implements SeasoningDecorator {

    @Override
    public void addSeasoning() {
        System.out.println(" + 蜂蜜");
    }
}
