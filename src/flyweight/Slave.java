package flyweight;

/**
 * @author joy
 * @time 2019/09/21 09:25
 */
public class Slave {

    private String name;

    public Slave(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Slave{" +
                "name='" + name + '\'' +
                '}';
    }
}
