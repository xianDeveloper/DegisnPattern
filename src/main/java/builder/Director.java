package builder;

/**
 * @author Johnson
 * @date 2019/11/28 20:22
 */
public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
