package simpleFactory.goodSample;

/**
 * @author Johnson
 * @date 2019/11/18 20:45
 */
public class SubOperation extends Operation {
    @Override
    public double getResult() {

        double result = 0;
        result = getNumber1()-getNumber2();
        return result;
    }
}
