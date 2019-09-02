package strategy;

/**
 * @author Johnson
 * @date 2019/9/2 17:18
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Double money = context.calRecharge(100d, RechargeTypeEnum.EBANK.getType());

        System.out.println(money);

        Double money1 = context.calRecharge(100d, RechargeTypeEnum.MOBILE.getType());
        System.out.println(money1);
    }

}
