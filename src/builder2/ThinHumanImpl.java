package builder2;

/**
 * @author joy
 * @time 2019/09/17 11:06
 */
public class ThinHumanImpl implements Human {

    @Override
    public void makeHeader() {
        System.out.println("瘦 头");
    }

    @Override
    public void makeBody() {
        System.out.println("瘦 身体");
    }

    @Override
    public void makeArmLeft() {
        System.out.println("瘦 左手");
    }

    @Override
    public void makeArmRight() {
        System.out.println("瘦 右手");
    }

    @Override
    public void makeLegLeft() {
        System.out.println("瘦 左脚");
    }

    @Override
    public void makeLegRight() {
        System.out.println("瘦 右脚");
    }
}
