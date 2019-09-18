package composite;

/**
 * 打工仔
 *
 * @author joy
 * @time 2019/09/18 20:11
 */
public class Slave extends Employee {

    public Slave() {
    }

    public Slave(String name) {
        this.name = name;
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public void display(int dept) {
        for (int i = 0; i < dept; i++) {
            System.out.print("-");
        }
        System.out.println(" 奴隶 [ "+ name +" ] 使劲干活, 功劳都是领导的 ");
    }
}
