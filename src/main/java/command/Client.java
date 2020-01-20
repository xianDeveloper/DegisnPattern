package command;

/**
 * @author Johnson
 * @date 2020/1/20 10:18
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();


        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
//        concreteCommand.execute();


        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand);

        invoker.executeCommand();



    }
}
