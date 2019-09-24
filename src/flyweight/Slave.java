package flyweight;

/**
 * 奴隶
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
