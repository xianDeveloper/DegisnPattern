package Component;

/**
 * @author Johnson
 * @date 2020/1/15 17:21
 */
public class Client {
    public static void main(String[] args) {
        Composite composite = new Composite("root");
        composite.add(new Leaf("leaf a"));
        composite.add(new Leaf("leaf b"));

        Composite x = new Composite("x");
        x.add(new Leaf("leaf ax"));
        x.add(new Leaf("leaf bx"));

        composite.add(x);

        composite.display(1);

    }
}
