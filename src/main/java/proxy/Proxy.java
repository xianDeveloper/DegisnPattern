package proxy;

/**
 * @author Johnson
 * @date 2019/11/21 17:09
 */
public class Proxy extends Subject {
    RealSubject realSubject;
    @Override
    public void request() {
        if(null == realSubject){
            realSubject = new RealSubject();
        }

        realSubject.request();
    }
}
