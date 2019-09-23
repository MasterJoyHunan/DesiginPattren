package command;

/**
 * @author joy
 * @time 2019/09/20 08:39
 */
public class Developer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(String some) {
        System.out.println("上班时间, 努力工作 加班......");
    }

    public void life(String some) {
        System.out.println("下班时间, 努力工作 加班......");
    }
}
