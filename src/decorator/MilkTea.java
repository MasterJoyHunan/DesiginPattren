package decorator;


/**
 * @author joy
 * @time 2019/09/07 10:47
 */
public class MilkTea implements Seasoning {

    @Override
    public void addSeasoning() {
        System.out.println("标准动作 + 奶茶 ");
    }
}
