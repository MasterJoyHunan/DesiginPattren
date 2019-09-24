package command;

import java.util.ArrayList;
import java.util.List;

/**
 * 发布命令的领导
 */
public class Leader {

    private List<Command> command = new ArrayList<>();

    public void setCommand(Command command) {
        this.command.add(command);
    }

    public void advise() {
        for (Command com : command) {
            com.exec(Leader.class.getName());
        }
        command.clear();
    }
}
