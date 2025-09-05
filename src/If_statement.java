import java.util.Scanner;
public class If_statement {
    public static void main (String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("enter the name:");
        String name=scan.nextLine();
        if(name.equals("praveen")){
            System.out.println("entered name is correct");
    }
    }
}
