package proxy;

/**
 * @author Johnson
 * @date 2019/11/21 17:08
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实请求");
    }
}
