package mediator;

/**
 * 汪先生
 */
public class MrWangSpy implements Spy {

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
    public void sendMsg(String msg, Army army) {
        if (army == huangJun) {
            gongJun.receiveMsg("获取到日军情报 : " + msg);
        } else {
            huangJun.receiveMsg("散布假情报 : " + msg);
        }
    }
}
