package bridge;

import lombok.Data;
import simpleFactory.badSample.Operation;

/**
 * @author Johnson
 * @date 2020/1/20 9:17
 */
@Data
public class Abstraction {
    protected Implementor implementor;

    public void operation(){
        implementor.operation();
    }

}
