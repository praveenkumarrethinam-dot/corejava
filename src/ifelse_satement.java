<<<<<<< HEAD
import java.lang.System;
import java.util.Scanner;
public class ifelse_satement {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number:");
        try{
        int num=scan.nextInt();
        if (num%2==0){
            System.out.println("this is even number");
        }
        else
        {
            System.out.println("this is odd number");
        }}
        catch(Exception e){
            System.out.println("invalid input"+e);}



    }
}
=======
import java.lang.System;
import java.util.Scanner;
public class ifelse_satement {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();
        if (num%2==0){
            System.out.println("this is even number");
        }
        else
        {
            System.out.println("this is odd number");
        }



    }
}
>>>>>>> 53da6943834400b7f24af1c01f3d93479a96dfc0
