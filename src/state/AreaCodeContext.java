package state;

/**
 * 状态上下文
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
