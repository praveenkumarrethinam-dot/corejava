//treemap
import java.util.TreeMap;
public class Marks {
    public static void main(String[] args) {
        TreeMap<String,Integer> Marks =new TreeMap<>();
        Marks.put("praveen", 60);
        Marks.put("bharath", 76);
        Marks.put("mani", 99);
        Marks.put("vijay", 56);
        Marks.put("surya", 95);
        for (String i:Marks.keySet()){
            System.out.println("key:"+i+"value:"+Marks.get(i));
        }
    }
}
