<<<<<<< HEAD
import java.util.Scanner;
public class Do_while {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=scan.nextInt();
        int fact=1;
        int i=1;
        do{
            fact=i*fact;
            i++;
        }while(i<=num);
        System.out.print(fact);
    }
}
=======
import java.util.Scanner;
public class Do_while {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=scan.nextInt();
        int fact=1;
        int i=1;
        do{
            fact=i*fact;
            i++;
        }while(i<=num);
        System.out.print(fact);
    }
}
>>>>>>> 53da6943834400b7f24af1c01f3d93479a96dfc0
