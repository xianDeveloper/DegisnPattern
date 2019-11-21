package decorator;

/**
 * @author Johnson
 * @date 2019/11/21 16:05
 * 就是具体的装饰对象
 */
public abstract class Decorator extends ConcreteComponent{
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(null != component){
            component.operation();
        }
    }
}
