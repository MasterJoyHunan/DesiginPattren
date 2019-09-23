package mediator;

/**
 * @author joy
 * @time 2019/09/20 18:02
 */
public class GongArmy extends Army {

    public GongArmy(Traitor traitor) {
        super(traitor);
    }



    @Override
    public void receiveMsg(String msg) {
        System.out.println(GongArmy.class.getName() + " 收到信息 : " + msg);
    }
}
