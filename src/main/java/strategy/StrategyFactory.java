package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Johnson
 * @date 2019/9/2 17:06
 * @Description
 */
public class StrategyFactory {
    private static StrategyFactory factory = new StrategyFactory();

    private StrategyFactory(){

    }

    private static Map<String, Strategy> strategyMap = new HashMap<>();

    static{
        strategyMap.put(RechargeTypeEnum.EBANK.getType(), new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.MOBILE.getType(), new MobileStrategy());
    }

    public Strategy creator(String type){
        return strategyMap.get(type);
    }

    public static StrategyFactory getInstance(){
        return factory;
    }
}
