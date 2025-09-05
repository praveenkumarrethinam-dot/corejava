import java.util.Scanner;
public class Nestedif_statement {
    public static void main(String[] args) {
        String frontend = "html";
        String backend = "java";
        if (frontend.equals("html")) {
            if (backend.equals("java")) {
                System.out.println("join course");
            }
            else{
                System.out.println("dont study backend");
            }
        } else {
            System.out.println("dont join course");
        }
    }
}

