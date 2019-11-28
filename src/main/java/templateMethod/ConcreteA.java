package templateMethod;

/**
 * @author Johnson
 * @date 2019/11/26 17:57
 */
public class ConcreteA extends AbstractClass {
    @Override
    public void operation1() {
        System.out.println("a 1");
    }

    @Override
    public void operation2() {
        System.out.println("a 2");
    }
}
