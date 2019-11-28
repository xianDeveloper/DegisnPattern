package builder;

/**
 * @author Johnson
 * @date 2019/11/28 20:24
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();



        director.construct(builder1);
        Product p1 = builder1.getResult();

        p1.show();

    }
}
