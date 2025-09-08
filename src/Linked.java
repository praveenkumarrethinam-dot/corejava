//linked list
import java.util.LinkedList;
public class Linked {
    public static void main(String[] args) {
        LinkedList<String> bird=new LinkedList<>();
        bird.add("parrot");
        bird.add("peacock");
        bird.add("hen");
        bird.add("sparrow");
        System.out.println(bird);
        bird.remove("sparrow");
        System.out.println(bird);

    }
}
