package bridge;

/**
 * @author Johnson
 * @date 2020/1/20 9:18
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
