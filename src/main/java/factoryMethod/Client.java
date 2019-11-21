package factoryMethod;

/**
 * @author Johnson
 * @date 2019/11/21 20:24
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng undergraduate = factory.createLeiFeng();

        undergraduate.rice();
        undergraduate.sweep();
        undergraduate.wash();
    }
}
