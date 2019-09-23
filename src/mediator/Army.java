package mediator;

/**
 * @author joy
 * @time 2019/09/20 17:48
 */
public abstract class Army {

    protected Traitor traitor;

    public Army(Traitor traitor) {
        this.traitor = traitor;
    }

    public void talk(String msg) {
        traitor.talk(msg, this);
    }

    public abstract void receiveMsg(String msg);
}
