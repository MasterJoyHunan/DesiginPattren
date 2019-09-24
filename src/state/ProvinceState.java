package state;

/**
 * 判断是否属于省
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
