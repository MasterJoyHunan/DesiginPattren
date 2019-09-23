package chain_of_responsibility2;

/**
 * @author joy
 * @time 2019/09/20 16:31
 */
public class Test {
    public static void main(String[] args) {
        ReportHandel boss2       = new BossReportHandel(null);
        ReportHandel ceo2        = new CEOReportHandel(boss2);
        ReportHandel teamLeader2 = new GroupLeaderReportHandel(ceo2);
        ReportHandel joy2        = new SalveReportHandel(teamLeader2);

        for (int i = 0; i < 5; i++) {
            joy2.handelRequest(i);
        }
    }
}
