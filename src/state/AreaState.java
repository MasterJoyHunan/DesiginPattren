package state;

/**
 * 判断是否属于县区
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
