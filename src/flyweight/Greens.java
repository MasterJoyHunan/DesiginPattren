package flyweight;

/**
 * 绿色食品
 */
public class Greens implements Flyweight {

    @Override
    public void giveFood(Slave joy) {
        System.out.println("提供青菜" + joy + " eat");
    }
}
