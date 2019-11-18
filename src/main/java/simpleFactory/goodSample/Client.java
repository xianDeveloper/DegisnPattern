package simpleFactory.goodSample;

/**
 * @author Johnson
 * @date 2019/11/18 20:50
 */
public class Client {
    public static void main(String[] args) {
        Operation oper ;
        oper = OperationFactory.createOperation("+");
        oper.setNumber1(20);
        oper.setNumber2(10);
        double result =oper.getResult();
        System.out.println("result is "+result);
    }
}
