package memento;

/**
 * 备忘录
 *
 * @author joy
 * @time 2019/09/18 19:15
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
