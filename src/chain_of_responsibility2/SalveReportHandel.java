package chain_of_responsibility2;

/**
 * @author joy
 * @time 2019/09/20 16:19
 */
public class SalveReportHandel extends ReportHandel {

    public SalveReportHandel(ReportHandel handel) {
        super(handel);
    }

    @Override
    public boolean nextHandel(int number) {
        System.out.println(SalveReportHandel.class.getName() + " 汇报工作" + number);
        return true;
    }
}
