package state;

/**
 * @author joy
 * @time 2019/09/18 09:10
 */
public class CityState implements State {

    @Override
    public void auth(AreaCodeContext context) {
        if (context.getAreaCode().length() == 4) {
            System.out.println("我是市");
        } else {
            context.setState(new AreaState());
            context.belong();
        }
    }
}
