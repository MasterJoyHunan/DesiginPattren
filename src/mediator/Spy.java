package mediator;

/**
 * 间谍
 */
interface Spy {

    /**
     * 发送情报
     * @param msg
     * @param army
     */
    void sendMsg(String msg, Army army);
}
