package command;


public class Test {

    public static void main(String[] args) {
        Leader    leader = new Leader();
        Developer joy    = new Developer();
        joy.setName("joy");
        Developer bobo   = new Developer();
        bobo.setName("bobo");
        Command work = new  WorkCommand();
        Command life = new LifeCommand();

        work.add(joy);
        work.add(bobo);

        life.add(joy);
        life.add(bobo);


        leader.setCommand(work);
        leader.setCommand(work);
        leader.advise();
        System.out.println("下班时间到......");
        leader.setCommand(life);
        leader.advise();
    }
}
