package command;

/**
 * 工作命令
 */
public class WorkCommand extends Command {

    @Override
    public void exec(String command) {
        for (Developer dev : developers) {
            dev.work(command);
        }
    }
}
