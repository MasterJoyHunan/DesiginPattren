package chain_of_responsibility;

/**
 * 责任链模式
 * -- 发送报告
 */
abstract class ReportHandel {

    protected ReportHandel handel;

    public void setSuccessor(ReportHandel handel) {
        this.handel = handel;
    }

    public abstract void handelRequest(int number);
}
