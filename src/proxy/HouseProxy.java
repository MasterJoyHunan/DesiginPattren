package proxy;

/**
 * 代理
 */
public class HouseProxy implements Proxy {

    private Tanant xiaoming;

    public HouseProxy(Tanant xiaoming) {
        this.xiaoming = xiaoming;
    }

    @Override
    public void findHouse() {
        xiaoming.findHouse();
        System.out.println("代理帮 " + xiaoming.getName() + " 找房子");
    }
}
