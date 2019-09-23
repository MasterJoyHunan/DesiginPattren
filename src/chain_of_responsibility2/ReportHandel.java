package chain_of_responsibility2;

/**
 * @author joy
 * @time 2019/09/20 16:14
 */
abstract class ReportHandel {

    protected ReportHandel handel;

    /**
     * 模板执行方式
     *
     * @param number
     * @return
     */
    public abstract boolean nextHandel(int number);

    public ReportHandel() {
    }

    public ReportHandel(ReportHandel handel) {
        this.handel = handel;
    }

    /**
     * 设置后继
     *
     * @param handel
     */
    public void setSuccessor(ReportHandel handel) {
        this.handel = handel;
    }

    /**
     * 操作
     *
     * @param number
     */
    public void handelRequest(int number) {
        if (!nextHandel(number)) {
            return;
        }
        if (handel != null) {
            handel.handelRequest(number);
        }
    }


}
