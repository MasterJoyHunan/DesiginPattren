package adapter;

/**
 * @author joy
 * @time 2019/09/18 17:16
 */
public class Test {

    public static void main(String[] args) {
        Adapter translate = new HumanAdapter();
        translate.toEnglish();
    }
}
