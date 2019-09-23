package flyweight;

/**
 * @author joy
 * @time 2019/09/21 09:00
 */
public class Greens implements Flyweight {

    @Override
    public void giveFood(Slave joy) {
        System.out.println("提供青菜" + joy + " eat");
    }
}
