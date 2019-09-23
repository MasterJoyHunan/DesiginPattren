package builder;

/**
 * @author joy
 * @time 2019/09/17 11:09
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
