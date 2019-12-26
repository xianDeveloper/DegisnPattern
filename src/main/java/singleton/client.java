package singleton;

import decorator.ConcreteB;

/**
 * @author Johnson
 * @date 2019/12/3 20:05
 */
public class client {
    public static void main(String[] args) {

        ConcreteB b = SingleEnum.Data.getConcreteB();
    }
}
