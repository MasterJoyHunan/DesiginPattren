package builder;

/**
 * 胖子克隆人
 */
public class FatHumanBuilder extends HumanBuilder {

    @Override
    void buildHeader() {
        System.out.println("胖 头");
    }

    @Override
    void buildBody() {
        System.out.println("胖 身体");
    }

    @Override
    void buildArmLeft() {
        System.out.println("胖 左手");
    }

    @Override
    void buildArmRight() {
        System.out.println("胖 右手");
    }

    @Override
    void buildLegLeft() {
        System.out.println("胖 左脚");
    }

    @Override
    void buildLegRight() {
        System.out.println("胖 右脚");
    }
}
