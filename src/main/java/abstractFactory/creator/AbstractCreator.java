package abstractFactory.creator;

import abstractFactory.product.AbstractProductA;
import abstractFactory.product.AbstractProductB;

public abstract class AbstractCreator {

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
