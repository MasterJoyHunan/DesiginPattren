package composite;


public class Test {

    public static void main(String[] args) {
        Employee boss = new Leader("boss");
        Employee wife_boos = new Slave(" BOSS IS WIFE");

        Employee CEO = new Leader(" CEO");
        Employee CTO = new Leader(" CTO");

        boss.add(wife_boos);
        boss.add(CEO);
        boss.add(CTO);

        Employee CEO_SALVE_1= new Slave(" CEO_SALVE_1");
        Employee CEO_SALVE_2 = new Slave(" CEO_SALVE_2");

        CEO.add(CEO_SALVE_1);
        CEO.add(CEO_SALVE_2);

        Employee CTO_SALVE_1= new Slave(" CTO_SALVE_1");
        Employee CTO_SALVE_2 = new Slave(" CTO_SALVE_2");

        CTO.add(CTO_SALVE_1);
        CTO.add(CTO_SALVE_2);

        System.out.println(boss);
        boss.display(0);
    }
}
