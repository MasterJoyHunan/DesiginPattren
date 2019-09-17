package builder;

/**
 * @author joy
 * @time 2019/09/17 11:14
 */
public class Test {

    public static void main(String[] args) {
        Director human = new Director(new FatHumanBuilder());
        human.createHuman();
    }


}
