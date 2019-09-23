package mediator;

/**
 * @author joy
 * @time 2019/09/20 18:01
 */
public class HuangArmy extends Army {

    public HuangArmy(Traitor traitor) {
        super(traitor);
    }



    @Override
    public void receiveMsg(String msg) {
        System.out.println(HuangArmy.class.getName() + " 收到信息 : " + msg);
    }
}
