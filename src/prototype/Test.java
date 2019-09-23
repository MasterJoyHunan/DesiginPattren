package prototype;

public class Test {
    public static void main(String[] args) {
        HumanClone clone  = new HumanClone("joy", "male", 18);
        clone.setJob("看家护院");
        HumanClone clone2 = (HumanClone) clone.clone();
        HumanClone clone3 = (HumanClone) clone.clone();

        clone.setJob("做饭洗碗");
        clone3.setAge(21);

        System.out.println(clone);
        System.out.println(clone2);
        System.out.println(clone3);
    }
}
