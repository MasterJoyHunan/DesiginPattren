package chain_of_responsibility;

/**
 * @author joy
 * @time 2019/09/20 16:22
 */
public class BossReportHandel extends ReportHandel {

    @Override
    public void handelRequest(int number) {
        if (number <= 3) {
            System.out.println(BossReportHandel.class.getName() + " 这什么狗屁玩意");
        } else  {
            System.out.println(BossReportHandel.class.getName() + " 你真是个天才, 继续努力");
        }

        System.out.println("=============");
        System.out.println();
    }
}
