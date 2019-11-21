package decorator;

/**
 * @author Johnson
 * @date 2019/11/21 16:18
 */
public class ConcreteA extends Decorator {
    private String addState;

    @Override
    public void operation() {
        super.operation();
        addState = "New State";
        System.out.println("具体装饰对象A来执行");
    }
}
