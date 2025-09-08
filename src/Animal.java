//abstract
abstract class animals{
    abstract void makesound();
}
class dog extends animals {
    void makesound() {
        System.out.print("dog barks");
    }
}
class cat extends animals{
    void makesound(){
        System.out.print("meow");
    }
}



public class Animal {
    public static void main(String[] args) {
        dog d=new dog();
        cat c=new cat();
        d.makesound();
        c.makesound();
    }
    }

