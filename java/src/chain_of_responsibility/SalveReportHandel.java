package chain_of_responsibility;

/**
 * @author joy
 * @time 2019/09/20 16:19
 */
public class SalveReportHandel extends ReportHandel {

    @Override
    public void handelRequest(int number) {
        System.out.println(SalveReportHandel.class.getName() + " 汇报工作" + number);
        if (handel != null) {
            handel.handelRequest(number);
        }
    }
}
