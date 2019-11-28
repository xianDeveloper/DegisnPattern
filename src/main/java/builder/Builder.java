package builder;

/**
 * @author Johnson
 * @date 2019/11/28 20:17
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public abstract Product getResult();
}
