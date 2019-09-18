package observer;

/**
 * 通知者
 *
 * @author joy
 * @time 2019/09/17 14:43
 */
interface Notice {
    /**
     * 添加观察者
     *
     * @param observer
     */
    void attach(Observer observer);


    /**
     * 移除观察者
     *
     * @param observer
     */
    void detach(Observer observer);


    /**
     * 通知观察者
     *
     * @param notice
     */
    void notifyObserver(String notice);
}
