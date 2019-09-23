package builder2;

/**
 * @author joy
 * @time 2019/09/17 11:06
 */
public class FatHumanBuild implements HumanBuilder {
    private FatHumanImpl fat = new FatHumanImpl();

    @Override
    public void build() {
        fat.makeHeader();
        fat.makeBody();
        fat.makeArmLeft();
        fat.makeArmRight();
        fat.makeLegRight();
        fat.makeLegLeft();
    }

    @Override
    public Human getHuman() {
        return fat;
    }
}
