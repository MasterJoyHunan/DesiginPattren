package mediator;

/**
 * @author joy
 * @time 2019/09/20 19:04
 */
public class Test {

    public static void main(String[] args) {
        MrWangTraitor wang = new MrWangTraitor();

        HuangArmy huang = new HuangArmy(wang);
        GongArmy gong = new GongArmy(wang);

        wang.setGongJun(gong);
        wang.setHuangJun(huang);

        huang.talk("我要进行918事变");
        gong.talk("二营长, 你他娘的意大利炮呢");

    }
}
