package mediator;

/**
 * @author Johnson
 * @date 2019/9/29 10:41
 * @Description
 */
public class ConcreteMediator extends Mediator {

    public ConcreteMediator(Colleague colleagueA, Colleague colleagueB) {
        super(colleagueA, colleagueB);
    }

    @Override
    public void notifyColleagueA() {
        if(null != colleagueA)
        colleagueA.operation();

    }

    @Override
    public void notifyColleagueB() {
        if(null != colleagueB)
        colleagueB.operation();
    }
}
