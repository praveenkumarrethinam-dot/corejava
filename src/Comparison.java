public class Comparison {
    public static void main(String args[]){
        String a=new String("orange");
        String b=new String("orange");

        String a1="apple";
        String a2="apple";
        System.out.println(a1==a2);
        System.out.println(a==b);
        System.out.println(a1.equals(a2));
        System.out.println(a.equals(b));
    }
}
