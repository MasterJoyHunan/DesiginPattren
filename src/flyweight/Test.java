package flyweight;

public class Test {

    public static void main(String[] args) {

        Flyweight steak1 = FlyweightFactory.getFlyweight(Steak.class.getName());
        steak1.giveFood(new Slave("master"));

        Flyweight steak2 = FlyweightFactory.getFlyweight(Steak.class.getName());
        steak2.giveFood(new Slave("joy"));

        Flyweight greens1 = FlyweightFactory.getFlyweight(Greens.class.getName());
        greens1.giveFood(new Slave("bobo"));

        Flyweight greens2 = FlyweightFactory.getFlyweight(Greens.class.getName());
        greens2.giveFood(new Slave("jack"));
    }
}
