package builder;

/**
 * 指挥长
 */
public class Director {

    private HumanBuilder human;

    public Director(HumanBuilder human) {
        this.human = human;
    }

    public void createHuman() {
        human.buildHeader();
        human.buildBody();
        human.buildArmLeft();
        human.buildArmRight();
        human.buildLegLeft();
        human.buildLegRight();
    }
}
