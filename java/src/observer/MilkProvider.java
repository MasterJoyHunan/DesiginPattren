package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 牛奶供应商
 *
 * @author joy
 * @time 2019/09/17 14:51
 */
public class MilkProvider implements Notice {

    List<Observer> list = new ArrayList<>();

    /**
     * 添加订牛奶的人
     *
     * @param observer
     */
    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    /**
     * 移除订牛奶的人
     *
     * @param observer
     */
    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知订牛奶的人
     *
     * @param notice
     */
    @Override
    public void notifyObserver(String notice) {
        for (Observer obj: list) {
            obj.update();
        }
    }
}
