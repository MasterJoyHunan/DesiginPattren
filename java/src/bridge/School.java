package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joy
 * @time 2019/09/19 15:04
 */
abstract class School {

    protected List<Class> clazz = new ArrayList<>();

    public void setClazz(Class clazz) {
        this.clazz.add(clazz);
    }

    public abstract void payTuition();
}
