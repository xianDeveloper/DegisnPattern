package command;

import lombok.Data;

/**
 * @author Johnson
 * @date 2020/1/20 10:18
 */
@Data
public class Invoker {
    private Command command;

    public void executeCommand(){
        command.execute();
    }
}
