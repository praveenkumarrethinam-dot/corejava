import java.util.Scanner;

public class Newcal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number1;
        String number2;
        char option;
        double num1=0;
        double num2=0;
        double result=0;
        System.out.println("enter the first number");
        number1 = scan.nextLine();
        System.out.println("enter the option");
        option = scan.next().charAt(0);
        System.out.println("enter the second number");
        number2 = scan.next();
        double sum=0;

        for(int i = 0; i<number1.length(); i++){
            char ch=number1.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                System.out.println("invalid input");
            }
            else
            {
              double a=ch -'0';
              sum=(sum*10)+a;
            }
           num1=sum;
        }
         sum=0;
        for(int i = 0; i<number2.length(); i++){
            char ch=number2.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                System.out.println("invalid input");
            }
            else
            {
                double a=ch -'0';
                sum=(sum*10)+a;
            }
            num2=sum;
        }

        switch (option) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("result:"+result);
    }
}