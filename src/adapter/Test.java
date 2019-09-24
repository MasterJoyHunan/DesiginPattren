package adapter;


public class Test {

    public static void main(String[] args) {
        Adapter translate = new HumanAdapter();
        translate.toEnglish();
    }
}
