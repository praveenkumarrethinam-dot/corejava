import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the num1:");
        double num1=scan.nextDouble();
        System.out.println("enter the option(+,-,*,/):");
        char option=scan.next().charAt(0);
        System.out.println("enter the num2:");
         double num2=scan.nextDouble();
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
                    System.out.println("invalid input");
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
