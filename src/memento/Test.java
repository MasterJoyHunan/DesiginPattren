package memento;

public class Test {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.state = "A";

        Caretaker c = new Caretaker();
        c.setMemento(o.createBackup());

        System.out.println(o);
        o.state = "B";
        System.out.println(o);
        o.setMemento(c.getMemento());
        System.out.println(o);
    }
}
