package builder;


public class Test {

    public static void main(String[] args) {
        Director human = new Director(new FatHumanBuilder());
        human.createHuman();
    }
}
