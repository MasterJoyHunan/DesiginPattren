package builder;

/**
 * 克隆人
 *
 * @author joy
 * @time 2019/09/17 11:02
 */
abstract class HumanBuilder {
    abstract void buildHeader();

    abstract void buildBody();

    abstract void buildArmLeft();

    abstract void buildArmRight();

    abstract void buildLegLeft();

    abstract void buildLegRight();
}
