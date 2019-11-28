package builder;

/**
 * @author Johnson
 * @date 2019/11/28 20:18
 */
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("A");

    }

    @Override
    public void buildPartB() {
        product.add("B");
    }

    @Override
    public void buildPartC() {
        product.add("C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
