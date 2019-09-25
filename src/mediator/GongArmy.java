package mediator;

/**
 * 共军
 */
public class GongArmy extends Army {

    public GongArmy(Spy spy) {
        super(spy);
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(GongArmy.class.getName() + " 收到信息 : " + msg);
    }
}
