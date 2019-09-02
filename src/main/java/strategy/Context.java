package strategy;

import lombok.Data;

/**
 * @author Johnson
 * @date 2019/9/2 17:04
 * @Description
 */
@Data
public class Context {
    private Strategy strategy;

    public Double calRecharge(Double charge, String type){
        strategy = StrategyFactory.getInstance().creator(type);

        return strategy.calRecharge(charge);
    }
}
