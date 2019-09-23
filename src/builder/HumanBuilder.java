package builder;

/**
 * 克隆人
 */
abstract class HumanBuilder {
    abstract void buildHeader();

    abstract void buildBody();

    abstract void buildArmLeft();

    abstract void buildArmRight();

    abstract void buildLegLeft();

    abstract void buildLegRight();
}
