package bridge;


public class Test {

    public static void main(String[] args) {
        School hndx = new HunanUniversity();

        Class class1 = new PhysicsClass();
        Class class2 = new PhysicsClass();

        Student student1 = new Student("A");
        Student student2 = new Student("B");
        Student student3 = new Student("C");
        Student student4 = new Student("D");

        hndx.setClazz(class1);
        hndx.setClazz(class2);

        class1.add(student1);
        class1.add(student2);

        class2.add(student3);
        class2.add(student4);

        hndx.payTuition();
    }
}
