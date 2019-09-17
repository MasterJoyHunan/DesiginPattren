package builder2;

/**
 * @author joy
 * @time 2019/09/17 11:06
 */
public class ThinHumanBuild implements HumanBuilder {

    private ThinHumanImpl thin = new ThinHumanImpl();

    @Override
    public void build() {
        thin.makeHeader();
        thin.makeBody();
        thin.makeArmLeft();
        thin.makeArmRight();
        thin.makeLegLeft();
        thin.makeArmRight();
    }

    @Override
    public Human getHuman() {
        return thin;
    }
}
