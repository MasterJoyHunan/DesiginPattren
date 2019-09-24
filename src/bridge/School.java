package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 学校抽象，学校聚合多个班级
 */
abstract class School {

    protected List<Class> clazz = new ArrayList<>();

    public void setClazz(Class clazz) {
        this.clazz.add(clazz);
    }

    public abstract void payTuition();
}
