package memento;

/**
 * 看管者
 *
 * @author joy
 * @time 2019/09/18 19:18
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
