package state;

/**
 * @author joy
 * @time 2019/09/18 09:11
 */
public class AreaState implements State {

    @Override
    public void auth(AreaCodeContext context) {
        if (context.getAreaCode().length() == 6) {
            System.out.println("我是区");
        } else {
            context.setState(new StreetState());
            context.belong();
        }
    }
}
