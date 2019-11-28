package builder;

/**
 * @author Johnson
 * @date 2019/11/28 20:18
 */
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("AA");

    }

    @Override
    public void buildPartB() {
        product.add("BB");
    }

    @Override
    public void buildPartC() {
        product.add("CC");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
