package command;

/**
 * @author joy
 * @time 2019/09/20 08:44
 */
public class WorkCommand extends Command {

    @Override
    public void exec(String command) {
        for (Developer dev : developer) {
            dev.work(command);
        }
    }
}
