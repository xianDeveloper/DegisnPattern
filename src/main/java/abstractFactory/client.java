package abstractFactory;

import abstractFactory.creator.AbstractCreator;
import abstractFactory.creator.impl.Creator1;
import abstractFactory.creator.impl.Creator2;
import abstractFactory.product.AbstractProductA;
import abstractFactory.product.AbstractProductB;

public class client {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA a1 = creator1.createProductA();
        AbstractProductA a2 = creator2.createProductA();

        AbstractProductB b1 = creator1.createProductB();
        AbstractProductB b2 = creator2.createProductB();

        a1.doSth();
        a2.doSth();
        b1.doSth();
        b2.doSth();
    }
}
