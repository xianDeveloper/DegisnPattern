package observer;

/**
 * @author Johnson
 * @date 2019/12/26 20:21
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer = new ConcreteObserver("观察1", subject);
        ConcreteObserver observer1 = new ConcreteObserver("观察2", subject);


        subject.attach(observer);
        subject.attach(observer1);

        subject.getSubjectState();
        subject.setSubjectState("fuck");

        subject.notifyObserver();
    }
}
