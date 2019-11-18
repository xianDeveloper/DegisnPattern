package simpleFactory.badSample;

/**
 * @author Johnson
 * @date 2019/11/18 20:13
 */
public class Operation {
    public static double getResult(double number1, double number2, String operate) {
        double result = 0;
        switch (operate) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }

        return result;
    }
}
