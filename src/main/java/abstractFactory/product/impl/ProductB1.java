package abstractFactory.product.impl;

import abstractFactory.product.AbstractProductB;

public class ProductB1 extends AbstractProductB {
    /**
     * 每个产品相同方法，不同的实现
     */
    @Override
    public void doSth() {
        System.out.println("Product B1's doSth");
    }
}
