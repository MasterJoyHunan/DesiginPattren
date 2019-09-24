package command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式抽象
 */
abstract class Command {

    protected List<Developer> developers = new ArrayList<>();

    public void add(Developer developer) {
        developers.add(developer);
    }

    public abstract void exec(String command);
}
