package factoryMethod;

/**
 * @author Johnson
 * @date 2019/11/21 20:23
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
