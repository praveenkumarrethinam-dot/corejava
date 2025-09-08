//calculator
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        double num1=0;
        double num2=0;
        char option='a';
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the num1:");
        //try{
        if(scan.hasNextDouble()) {
            num1 = scan.nextDouble();
            System.out.println("enter the option(+,-,*,/):");
            option=scan.next().charAt(0);
            if(option=='+' || option=='-' || option== '*' || option== '/'){
                System.out.println("enter the num2:");
                if(scan.hasNextDouble()){
                    num2=scan.nextDouble();
                }
                //else{
                  //  System.out.println("invalid input");
                //}
            }
           // else{
             //   System.out.println("invalid option");
            //}

        } //else{
           // System.out.println("invalid input");
        //}

        double result=0;
        switch(option) {
            case '+':
                result = num1 + num2;
                System.out.println("the result:" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("the result:" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("the result:" + result);
                break;
            case '/':
                if(num2==0){
                    System.out.println("invalid input.number cannot be divisible by zero");
                    break;
                }
                result = num1 / num2;
                System.out.println("the result:" + result);
                break;
            default:
                System.out.println("invalid choice");

        }
    }

}