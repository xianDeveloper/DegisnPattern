package templateMethod;

/**
 * @author Johnson
 * @date 2019/11/26 17:58
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass c;
        c = new ConcreteA();
        c.templateMethod();

        c = new ConcreteB();
        c.templateMethod();

    }
}
