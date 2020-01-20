package command;

/**
 * @author Johnson
 * @date 2020/1/20 10:14
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    abstract public void execute();

}
