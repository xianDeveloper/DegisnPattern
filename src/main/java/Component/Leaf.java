package Component;

/**
 * @author Johnson
 * @date 2020/1/15 16:54
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("can not add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("can not remove from a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println(new String("-") + depth + name);
    }
}
