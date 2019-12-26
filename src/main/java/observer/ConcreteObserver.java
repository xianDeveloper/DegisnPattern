package observer;

/**
 * @author Johnson
 * @date 2019/12/26 20:17
 */
public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        this.observerState = subject.getSubjectState();
        System.out.println("observer:{"+name+"}-new state:{"+observerState+"}");
    }
}

