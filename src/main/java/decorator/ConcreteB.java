package decorator;

/**
 * @author Johnson
 * @date 2019/11/21 16:18
 */
public class ConcreteB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰对象B来执行");
    }
    private void addBehavior(){
        System.out.println("b 执行自己的行为");
    }
}
