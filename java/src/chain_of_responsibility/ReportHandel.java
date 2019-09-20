package chain_of_responsibility;

/**
 * @author joy
 * @time 2019/09/20 16:14
 */
abstract class ReportHandel {

    protected ReportHandel handel;

    public void setSuccessor(ReportHandel handel) {
        this.handel = handel;
    }

    public abstract void handelRequest(int number);
}
