package chain_of_responsibility2;

/**
 * @author joy
 * @time 2019/09/20 16:20
 */
public class GroupLeaderReportHandel extends ReportHandel {

    public GroupLeaderReportHandel(ReportHandel handel) {
        super(handel);
    }

    @Override
    public boolean nextHandel(int number) {
        if (number <= 1) {
            System.out.println(GroupLeaderReportHandel.class.getName() + " 听了汇报,感觉像屎一样,回去重写");
            System.out.println("=============");
            System.out.println();
            return false;
        } else {
            System.out.println(GroupLeaderReportHandel.class.getName() + "向上级汇报");
            return true;
        }
    }
}
