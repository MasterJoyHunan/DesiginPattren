package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 领导
 *
 * @author joy
 * @time 2019/09/18 20:11
 */
public class Leader extends Employee {

    List<Employee> employees = new ArrayList<>();

    public Leader() {
    }

    public Leader(String name) {
        this.name = name;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }


    @Override
    public void display(int dept) {
        for (int i = 0; i < dept; i++) {
            System.out.print("-");
        }
        System.out.println(" 奴隶使劲干活, 功劳都是领导 [ " + name + " ] 的 ");
        for (Employee employee :
                employees) {
            employee.display(dept + 1);
        }
    }
}
