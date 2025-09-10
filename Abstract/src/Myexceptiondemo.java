import java.util.Scanner;
public class Myexceptiondemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        try{
            a=scan.nextInt();
            b=scan.nextInt();
            c=a/b;
        }
        catch(Exception e){
            System.out.println("the error is:"+e);
        }
        System.out.println("the values of c is:"+c);
    }
}

