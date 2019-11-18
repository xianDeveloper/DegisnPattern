package simpleFactory.goodSample;

/**
 * @author Johnson
 * @date 2019/11/18 20:31
 */
public class AddOperation extends Operation{
    @Override
    public double getResult() {
        double result = 0;
        result = getNumber1()+getNumber2();
        return result;
    }
}
