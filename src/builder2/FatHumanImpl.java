package builder2;

/**
 * @author joy
 * @time 2019/09/17 11:06
 */
public class FatHumanImpl implements Human {

    @Override
    public void makeHeader() {
        System.out.println("胖 头");
    }

    @Override
    public void makeBody() {
        System.out.println("胖 身体");
    }

    @Override
    public void makeArmLeft() {
        System.out.println("胖 左手");
    }

    @Override
    public void makeArmRight() {
        System.out.println("胖 右手");
    }

    @Override
    public void makeLegLeft() {
        System.out.println("胖 左脚");
    }

    @Override
    public void makeLegRight() {
        System.out.println("胖 右脚");
    }
}
