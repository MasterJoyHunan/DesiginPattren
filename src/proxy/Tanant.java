package proxy;

/**
 * @author joy
 * @time 2019/09/07 13:55
 */
public class Tanant implements Proxy {
    private String name;

    public Tanant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void findHouse() {
        System.out.println(name + " 找房子");
    }
}
