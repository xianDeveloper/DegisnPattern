package strategy;

import lombok.Data;

/**
 * @author Johnson
 * @date 2019/9/2 17:02
 * @Description
 */
public enum RechargeTypeEnum {
    EBANK("EBANK"),
    MOBILE("MOBILE");

    private String type;

    RechargeTypeEnum(){}

    RechargeTypeEnum(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

}
