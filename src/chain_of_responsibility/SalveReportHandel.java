package chain_of_responsibility;

/**
 * 奴隶提交报告
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
