package mediator;

/**
 * @author Johnson
 * @date 2019/9/29 10:39
 * @Description
 */
public class ConcreteColleagueB extends Colleague {

    public void notifyColleagueA(){
        mediator.notifyColleagueA();
    }

    @Override
    public void operation() {
        System.out.println("colleagueb operation");
    }
}
