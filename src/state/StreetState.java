package state;

/**
 * 判断是否属于街道
 */
public class StreetState implements State {

    @Override
    public void auth(AreaCodeContext context) {
        if (context.getAreaCode().length() == 9) {
            System.out.println("我是街道");
        } else {
            throw new IllegalArgumentException("areaCode 非法");
        }
    }
}
