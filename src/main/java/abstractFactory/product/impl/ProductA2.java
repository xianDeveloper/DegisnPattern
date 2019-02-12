package abstractFactory.product.impl;

import abstractFactory.product.AbstractProductA;

public class ProductA2 extends AbstractProductA {
    /**
     * 每个产品相同方法，不同的实现
     */
    @Override
    public void doSth() {
        System.out.println("Product A2's doSth");
    }
}
