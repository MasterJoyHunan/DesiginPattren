package vositor;

import java.util.ArrayList;
import java.util.List;

/**
 * 高层接口
 */
public class Context {

    private List<Human> humans = new ArrayList<>();

    public void add(Human human) {
        humans.add(human);
    }

    public void remove(Human human) {
        humans.remove(human);
    }

    public void act(Visitor visitor) {
        System.out.println();
        System.out.println("关于 " + visitor.getClass().getName() + " 看法");
        for (Human human : humans) {
            human.getAdvice(visitor);
        }
    }
}
