package mediator;

/**
 * 汪精卫
 *
 * @author joy
 * @time 2019/09/20 17:53
 */
public class MrWangTraitor implements Traitor {

    /**
     * 皇军
     */
    private Army huangJun;

    /**
     * 共产党
     */
    private Army gongJun;


    public void setHuangJun(Army huangJun) {
        this.huangJun = huangJun;
    }

    public void setGongJun(Army gongJun) {
        this.gongJun = gongJun;
    }

    @Override
    public void talk(String msg, Army army) {
        if (army == huangJun) {
            gongJun.receiveMsg("皇军托我给您带个话 : " + msg);
        } else {
            huangJun.receiveMsg("八路军跟我说 : " + msg);
        }
    }
}
