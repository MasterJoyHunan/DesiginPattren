package builder2;

/**
 * @author joy
 * @time 2019/09/17 11:14
 */
public class Test {

    public static void main(String[] args) {
        Director human = new Director();
        FatHumanImpl fat = human.buildFatHuman();

        ThinHumanImpl thin = human.buildThinHuman();
    }
}
