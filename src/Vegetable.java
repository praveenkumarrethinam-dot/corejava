//array list
import java.util.ArrayList;
public class Vegetable {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("apple");
        name.add("onion");
        name.add("tomato");
        name.add("potato");

        System.out.println("the first name is:"+name.get(0));

        System.out.println("delete second name:"+name.remove("tomato"));

        System.out.println("the size of the loop:"+name.size());
    }
}
