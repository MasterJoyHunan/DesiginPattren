package command;

/**
 * 生活命令
 */
public class LifeCommand extends Command {

    @Override
    public void exec(String command) {
        for (Developer dev : developers) {
            dev.life(command);
        }
    }
}
