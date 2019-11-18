package simpleFactory.badSample;

import java.util.Scanner;

/**
 * @author Johnson
 * @date 2019/11/18 20:16
 */
public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input number1");
        double number1 = sc.nextDouble();
        System.out.println("input number2");
        double number2 = sc.nextDouble();

        String operate = sc.nextLine();
        try{
            double result = Operation.getResult(number1,number2, operate);
        }catch(Exception e){
            System.err.println("error occur");
        }


    }
}
