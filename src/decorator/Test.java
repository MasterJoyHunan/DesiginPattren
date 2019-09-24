package decorator;


public class Test {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea();
        HonySeasoning honySeasoning = new HonySeasoning();
        IceSeasoning iceSeasoning = new IceSeasoning();

        honySeasoning.setSeasoning(milkTea);
        iceSeasoning.setSeasoning(honySeasoning);
        iceSeasoning.addSeasoning();

        milkTea.addSeasoning();
    }
}
