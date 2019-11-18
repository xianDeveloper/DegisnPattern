package simpleFactory.goodSample;

/**
 * @author Johnson
 * @date 2019/11/18 20:47
 */
public class DivOperation extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumber1()/getNumber2();
        return result;
    }
}
