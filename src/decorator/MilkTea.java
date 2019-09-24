package decorator;

/**
 * 基本奶茶
 */
public class MilkTea implements Seasoning {

    @Override
    public void addSeasoning() {
        System.out.println("标准动作 + 奶茶 ");
    }
}
