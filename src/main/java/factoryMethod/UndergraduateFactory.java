package factoryMethod;

/**
 * @author Johnson
 * @date 2019/11/21 20:21
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
