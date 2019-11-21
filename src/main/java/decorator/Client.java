package decorator;

/**
 * @author Johnson
 * @date 2019/11/21 16:23
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteA a = new ConcreteA();
        ConcreteB b = new ConcreteB();

        a.setComponent(c);
        b.setComponent(a);

        b.operation();
    }

}
