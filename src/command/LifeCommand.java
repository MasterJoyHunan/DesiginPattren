package command;

/**
 * @author joy
 * @time 2019/09/20 08:45
 */
public class LifeCommand extends Command {

    @Override
    public void exec(String command) {
        for (Developer dev : developer) {
            dev.life(command);
        }
    }
}
