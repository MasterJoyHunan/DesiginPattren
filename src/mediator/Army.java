package mediator;

/**
 * 军队抽象
 */
public abstract class Army {

    protected Spy spy;

    public Army(Spy spy) {
        this.spy = spy;
    }

    public void talk(String msg) {
        spy.sendMsg(msg, this);
    }

    public abstract void receiveMsg(String msg);
}
