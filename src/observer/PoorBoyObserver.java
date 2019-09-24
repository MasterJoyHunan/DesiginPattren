package observer;

/**
 * 穷人家的孩子订牛奶
 */
public class PoorBoyObserver implements Observer {
    @Override
    public void update() {
        System.out.println("穷人家的孩子 把牛奶喝了");
    }
}
