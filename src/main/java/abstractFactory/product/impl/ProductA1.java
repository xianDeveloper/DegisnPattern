package abstractFactory.product.impl;

import abstractFactory.product.AbstractProductA;

public class ProductA1 extends AbstractProductA {
    /**
     * 每个产品相同方法，不同的实现
     */
    @Override
    public void doSth() {
        System.out.println("Product A1's doSth");
    }
}
