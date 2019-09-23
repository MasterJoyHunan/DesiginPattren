package observer;

/**
 * @author joy
 * @time 2019/09/17 15:00
 */
public class Test {

    public static void main(String[] args) {
        Notice milk = new MilkProvider();
        Observer richBoy = new RichBoyObserver();
        Observer poorBoy = new PoorBoyObserver();

        milk.attach(richBoy);
        milk.attach(poorBoy);

        milk.notifyObserver("牛奶送到");

        milk.detach(poorBoy);
        milk.notifyObserver("牛奶送到");

    }
}
