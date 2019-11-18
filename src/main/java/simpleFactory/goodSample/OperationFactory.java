package simpleFactory.goodSample;

/**
 * @author Johnson
 * @date 2019/11/18 20:48
 */
public class OperationFactory {
    public static Operation createOperation(final String operation){
        Operation ope = null;

        switch (operation){
            case "+":ope = new AddOperation();break;
            case "-":ope = new SubOperation();break;
            case "*":ope = new MulOperation();break;
            case "/":ope = new DivOperation();break;
        }
        return ope;

    }
}
