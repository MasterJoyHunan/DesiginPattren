package adapter;

/**
 * @author joy
 * @time 2019/09/18 17:13
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
