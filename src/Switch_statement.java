
import java.util.Scanner;
public class Switch_statement {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("add");
        System.out.println("sub");
        System.out.println("mul");
        System.out.println("div");
        System.out.println("enter the choice:");
        String choice=scan.nextLine();
        switch(choice){
            case"add":
                System.out.println("enter the num1:");
                int num1=scan.nextInt();
                System.out.println("enter the num2:");
                int num2=scan.nextInt();
                int total=num1+num2;
                System.out.println(total);
                break;
            case"sub":
                System.out.println("enter the num1:");
                int num3=scan.nextInt();
                System.out.println("enter the num2:");
                int num4=scan.nextInt();
                int total2=num3-num4;
                System.out.println(total2);
                break;
            case"mul":
                System.out.println("enter the num1:");
                int num5=scan.nextInt();
                System.out.println("enter the num2:");
                int num6=scan.nextInt();
                int total3=num5*num6;
                System.out.println(total3);
                break;
            case"div":
                System.out.println("enter the num1:");
                int num7=scan.nextInt();
                System.out.println("enter the num2:");
                int num8=scan.nextInt();
                int total4=num7/num8;
                System.out.println(total4);
                break;
            default:
                System.out.println("invalid choice");



        }

    }
}
=======
import java.util.Scanner;
public class Switch_statement {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("add");
        System.out.println("sub");
        System.out.println("mul");
        System.out.println("div");
        System.out.println("enter the choice:");
        String choice=scan.nextLine();
        switch(choice){
            case"add":
                System.out.println("enter the num1:");
                int num1=scan.nextInt();
                System.out.println("enter the num2:");
                int num2=scan.nextInt();
                int total=num1+num2;
                System.out.println(total);
                break;
            case"sub":
                System.out.println("enter the num1:");
                int num3=scan.nextInt();
                System.out.println("enter the num2:");
                int num4=scan.nextInt();
                int total2=num3-num4;
                System.out.println(total2);
                break;
            case"mul":
                System.out.println("enter the num1:");
                int num5=scan.nextInt();
                System.out.println("enter the num2:");
                int num6=scan.nextInt();
                int total3=num5*num6;
                System.out.println(total3);
                break;
            case"div":
                System.out.println("enter the num1:");
                int num7=scan.nextInt();
                System.out.println("enter the num2:");
                int num8=scan.nextInt();
                int total4=num7/num8;
                System.out.println(total4);
                break;
            default:
                System.out.println("invalid choice");



        }

    }
}
>>>>>>> 53da6943834400b7f24af1c01f3d93479a96dfc0
