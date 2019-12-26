package singleton;

import decorator.ConcreteB;

import javax.sql.DataSource;

/**
 * @author Johnson
 * @date 2019/12/3 20:03
 */
public enum SingleEnum {
    Data;

    private ConcreteB concreteB ;

    private SingleEnum(){
        concreteB = new ConcreteB();
    }

    public ConcreteB getConcreteB(){
        return concreteB;
    }
}
