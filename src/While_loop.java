import java.util.Scanner;
public class While_loop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the num:");
        int num=scan.nextInt();
        int i=1;
        int sum=0;
        while(i<=num){
            sum+=i;
            i++;
            System.out.println(sum);
        }
    }
}
