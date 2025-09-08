import java.util.Scanner;
public class Elseif_satement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the score:");
        int score=scan.nextInt();
        if (score<50){
            System.out.println("you need to improve");
        }
        else if(score>50 && score<70)
       {
            System.out.println("good job");
        }
        else if(score>70){
            System.out.println("excellent");
        }

    }
}
