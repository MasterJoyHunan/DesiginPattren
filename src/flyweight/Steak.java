package flyweight;

/**
 * 肉食
 */
public class Steak implements Flyweight {

    @Override
    public void giveFood(Slave joy) {
        System.out.println("提供牛排" + joy + " eat");
    }
}
