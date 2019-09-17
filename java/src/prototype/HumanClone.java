package prototype;

/**
 * @author joy
 * @time 2019/09/16 19:47
 */
public class HumanClone implements Cloneable {
    private String name;
    private String sex;
    private int age;
    private Job job;


    public HumanClone(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        System.out.println("进行实例化");
    }

    public Job getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = new Job();
        this.job.setWork(job);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "HumanClone{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", job=" + job.getWork() +
                '}';
    }
}
