package mediator;


public class Test {

    public static void main(String[] args) {
        MrWangSpy wang = new MrWangSpy();

        HuangArmy huang = new HuangArmy(wang);
        GongArmy gong = new GongArmy(wang);

        wang.setGongJun(gong);
        wang.setHuangJun(huang);

        huang.talk("我们要偷袭珍珠港");
        gong.talk("二营长, 你他娘的意大利炮呢");
    }
}
