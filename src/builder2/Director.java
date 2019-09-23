package builder2;

/**
 * @author joy
 * @time 2019/09/17 11:09
 */
public class Director {

    private FatHumanBuild  fatHumanBuild  = new FatHumanBuild();
    private ThinHumanBuild thinHumanBuild = new ThinHumanBuild();

    /**
     * 建造胖的克隆人
     *
     * @return
     */
    public FatHumanImpl buildFatHuman() {
        fatHumanBuild.build();
        return (FatHumanImpl) fatHumanBuild.getHuman();
    }


    /**
     * 建造瘦的克隆人
     *
     * @return
     */
    public ThinHumanImpl buildThinHuman() {
        thinHumanBuild.build();
        return (ThinHumanImpl) thinHumanBuild.getHuman();
    }
}
