package mediator;

/**
 * @author Johnson
 * @date 2019/9/29 10:37
 * @Description
 */
public class ConcreteColleagueA  extends Colleague{

    public void notifyColleagueB(){
        mediator.notifyColleagueB();
    }

    @Override
    public void operation() {
        System.out.println("ColleagueA operations");
    }
}
