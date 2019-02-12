package abstractFactory.creator.impl;

import abstractFactory.creator.AbstractCreator;
import abstractFactory.product.AbstractProductA;
import abstractFactory.product.AbstractProductB;
import abstractFactory.product.impl.ProductA1;
import abstractFactory.product.impl.ProductB1;

public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
