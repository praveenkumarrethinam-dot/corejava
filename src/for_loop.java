import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();
        for (int i=1;i<=11;i++){
        int total =i*num;

        System.out.println(i+"*"+num+"="+total);

        }

    }
}
