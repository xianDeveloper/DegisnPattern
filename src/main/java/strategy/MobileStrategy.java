package strategy;

/**
 * @author Johnson
 * @date 2019/9/2 17:04
 * @Description
 */
public class MobileStrategy implements Strategy {
    @Override
    public Double calRecharge(Double charge) {
        return charge * 0.6;
    }
}
