package command;

/**
 * @author Johnson
 * @date 2020/1/20 10:16
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver){
        super(receiver);
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
