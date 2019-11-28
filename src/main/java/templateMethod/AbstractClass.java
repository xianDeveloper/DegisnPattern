package templateMethod;

/**
 * @author Johnson
 * @date 2019/11/26 17:55
 */
public  abstract class AbstractClass {
    public abstract void operation1();
    public abstract void operation2();

    public void templateMethod(){
        operation1();
        operation2();
        System.out.println("ab do t m");
    }
}
