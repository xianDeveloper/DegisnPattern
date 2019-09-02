package strategy;

/**
 * @author Johnson
 * @date 2019/9/2 17:03
 * @Description
 */
public class EBankStrategy implements Strategy {
    @Override
    public Double calRecharge(Double charge) {
        return charge * 0.85;
    }
}
