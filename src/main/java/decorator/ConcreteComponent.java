package decorator;

/**
 * @author Johnson
 * @date 2019/11/21 16:04
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象操作");
    }
}
