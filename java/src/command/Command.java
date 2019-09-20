package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joy
 * @time 2019/09/20 08:38
 */
abstract class Command {

    protected List<Developer> developer = new ArrayList<>();

    public void add(Developer developer) {
        this.developer.add(developer);
    }

    public abstract void exec(String command);
}
