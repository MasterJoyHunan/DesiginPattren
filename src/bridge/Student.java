package bridge;

/**
 * @author joy
 * @time 2019/09/19 15:05
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public void payTuition() {
        System.out.println(this + " pay him self tuition");
    }
}
