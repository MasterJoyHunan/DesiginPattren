package decorator2;


public class Test {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();
        milkTea.setSeasoning(new HonySeasoning());
        milkTea.setSeasoning(new IceSeasoning());
        milkTea.addSeasoning();
    }
}
