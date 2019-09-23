package builder;

/**
 * 瘦子克隆人
 */
public class ThinHumanBuilder extends HumanBuilder {

    @Override
    void buildHeader() {
        System.out.println("瘦 头");
    }

    @Override
    void buildBody() {
        System.out.println("瘦 身体");
    }

    @Override
    void buildArmLeft() {
        System.out.println("瘦 左手");
    }

    @Override
    void buildArmRight() {
        System.out.println("瘦 右手");
    }

    @Override
    void buildLegLeft() {
        System.out.println("瘦 左脚");
    }

    @Override
    void buildLegRight() {
        System.out.println("瘦 右脚");
    }
}
