package iterator;


public class Test {

    public static void main(String[] args) {
        ClassMate classMate = new ClassMate(5);

        classMate.add(new Student("A"));
        // classMate.add(new Student("B"));
        // classMate.add(new Student("C"));

        Iterator iterator = classMate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
