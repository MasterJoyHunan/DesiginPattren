package chain_of_responsibility;

/**
 * CEO处理意见
 */
public class CEOReportHandel extends ReportHandel {

    @Override
    public void handelRequest(int number) {
        if (number <= 2) {
            System.out.println(CEOReportHandel.class.getName() + " 听了汇报,感觉像屎一样,回去重写");
            System.out.println("=============");
            System.out.println();
        } else {
            System.out.println(CEOReportHandel.class.getName() + "向上级汇报");
            if (handel != null) {
                handel.handelRequest(number);
            }
        }
    }
}
