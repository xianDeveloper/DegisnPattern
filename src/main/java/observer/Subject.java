package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 抽象通知者
 * @author Johnson
 * @date 2019/12/26 20:10
 */
public abstract class Subject {
    private List<Observer> observerList = new LinkedList<>();

    /**
     * add 观察者
     * @param observer
     */
    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObserver(){
        for(Observer ob:observerList){
            ob.update();
        }
    }
}
