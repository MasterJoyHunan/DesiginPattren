package observer;

/**
 * 有钱人家的孩子
 */
public class RichBoyObserver implements Observer {

    @Override
    public void update() {
        System.out.println("有钱人家的孩子用牛奶洗脸");
    }
}
