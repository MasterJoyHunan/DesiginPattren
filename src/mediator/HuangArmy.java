package mediator;

/**
 * 皇军
 */
public class HuangArmy extends Army {

    public HuangArmy(Spy spy) {
        super(spy);
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(HuangArmy.class.getName() + " 收到信息 : " + msg);
    }
}
