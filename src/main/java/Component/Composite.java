package Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Johnson
 * @date 2020/1/15 17:16
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(new String("-") + depth + name);
        for (Component component : children) {
            component.display(depth+1);
        }
    }
}
