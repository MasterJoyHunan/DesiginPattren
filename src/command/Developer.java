package command;

/**
 * 可怜的程序员
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
        System.out.println(name + "上班时间, 努力工作");
    }

    public void life(String some) {
        System.out.println(name + "下班时间, 加班工作......");
    }
}
