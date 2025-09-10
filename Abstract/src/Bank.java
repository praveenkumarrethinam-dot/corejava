abstract class account{
    double total_amount;
    int amount;


    abstract void calculate_intrest();
    void display(){
        System.out.println("the total intrest of"+amount+" is:"+total_amount);
    }

}
class savingsaccount extends account{
    int amount;
    savingsaccount(int amount){
        this.amount=amount;
    }
    void calculate_intrest(){
        total_amount=amount % (0.05);
    }
    void display(){
        super.display();
    }

}
class currentaccount extends account{
    int amount;
    currentaccount(int amount){
        this.amount=amount;
    }
    void calculate_intrest(){
        total_amount=amount%(0.02);
    }
    void display(){
        super.display();
    }
}

public class Bank {
    public static void main(String[] args) {
        account s1 = new savingsaccount(5000);
        account c1 = new currentaccount(1000);

        s1.calculate_intrest();
        c1.calculate_intrest();

        s1.display();
        c1.display();
    }
}

