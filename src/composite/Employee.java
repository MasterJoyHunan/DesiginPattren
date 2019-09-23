package composite;

/**
 * @author joy
 * @time 2019/09/18 20:08
 */
abstract class Employee {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Employee employee);

    public abstract void remove(Employee employee);

    public abstract void display(int dept);

}
