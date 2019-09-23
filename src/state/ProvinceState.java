package state;

/**
 * @author joy
 * @time 2019/09/18 09:10
 */
public class ProvinceState implements State {

    @Override
    public void auth(AreaCodeContext context) {
        if (context.getAreaCode().length() == 2) {
            System.out.println("我是省");
        } else {
            context.setState(new CityState());
            context.belong();
        }
    }
}
