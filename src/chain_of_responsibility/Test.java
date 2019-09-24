package chain_of_responsibility;


public class Test {
    public static void main(String[] args) {
        ReportHandel joy = new SalveReportHandel();
        ReportHandel teamLeader = new GroupLeaderReportHandel();
        ReportHandel ceo = new CEOReportHandel();
        ReportHandel boss = new BossReportHandel();

        joy.setSuccessor(teamLeader);
        teamLeader.setSuccessor(ceo);
        ceo.setSuccessor(boss);

        for (int i = 0; i < 5; i++) {
            joy.handelRequest(i);
        }
    }
}
