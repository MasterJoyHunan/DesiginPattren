package decorator2;


/**
 * @author joy
 * @time 2019/09/07 10:55
 */
public class Test {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();
        milkTea.setSeasoning(new HonySeasoning());
        milkTea.setSeasoning(new IceSeasoning());
        milkTea.addSeasoning();
    }
}
