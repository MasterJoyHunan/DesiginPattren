package state;

/**
 * @author joy
 * @time 2019/09/18 09:12
 */
public class AreaCodeContext {

    private State state;
    private int   areaCode;

    public AreaCodeContext() {
        this.state = new ProvinceState();
    }

    public void belong() {
        state.auth(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getAreaCode() {
        return Integer.toString(areaCode);
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }
}
