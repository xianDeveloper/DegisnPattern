package abstractFactory.creator.impl;

import abstractFactory.creator.AbstractCreator;
import abstractFactory.product.AbstractProductA;
import abstractFactory.product.AbstractProductB;
import abstractFactory.product.impl.ProductA2;
import abstractFactory.product.impl.ProductB2;

public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
