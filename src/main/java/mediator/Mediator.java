package mediator;

/**
 * @author Johnson
 * @date 2019/9/29 10:34
 * @Description 抽象中介者
 */
public abstract class Mediator {
    protected Colleague colleagueA;
    protected Colleague colleagueB;

    public Mediator(Colleague colleagueA, Colleague colleagueB){
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    public abstract void notifyColleagueA();
    public abstract void notifyColleagueB();

}
