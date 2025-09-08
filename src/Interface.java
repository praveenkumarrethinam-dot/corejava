interface car{
    void tata();
    void ford();
    void swift();
}
class vehicle implements car{
    public void tata(){
        System.out.println("tata indica");
    }
    public void ford(){
        System.out.println("ford lancer");
    }
    public void swift() {
        System.out.println("glanza");
    }
}
public class Interface {
    public static void main(String[] args) {
        vehicle c1 = new vehicle();
        c1.tata();
        c1.ford();
        c1.swift();
    }

}