package flyweight;

/**
 * @author joy
 * @time 2019/09/21 08:58
 */
public class Steak implements Flyweight {

    @Override
    public void giveFood(Slave joy) {
        System.out.println("提供牛排" + joy + " eat");
    }
}
