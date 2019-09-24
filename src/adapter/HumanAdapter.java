package adapter;

/**
 * 翻译官
 */
public class HumanAdapter implements Adapter {

    private Chinese chinese = new Chinese();

    @Override
    public void toEnglish() {
        chinese.talk();
        System.out.println("翻译官转换为英语 : ");
        System.out.println("ba la ba la ba la ba la ba la");
    }
}
