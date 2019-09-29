package mediator;

import lombok.Setter;

/**
 * @author Johnson
 * @date 2019/9/29 10:31
 * @Description 抽象同事类
 */
public abstract class Colleague {
    @Setter
    protected Mediator mediator;

    public abstract void operation();


}
