abstract class shape {
    String shapename;
    double area;

    shape(String shapename) {
        this.shapename = shapename;
    }

    abstract void calculate_area();

    void display() {
        System.out.println("the  area of" + shapename + "is:" + area);
    }
}
class circle extends shape{
    int radius;

    circle(int radius){
        super("Circle");
        this.radius=radius;
    }
    void calculate_area(){
        area=2*radius*radius;
    }
    void display(){
        super.display();
    }
}
class rectangle extends shape{
    int length;
    int breadth;

    rectangle(int length,int breadth){
        super("Rectangle");
        this.length=length;
        this.breadth=breadth;
    }
    void calculate_area(){
        area=length*breadth;
    }
    void display(){
        super.display();
    }
}

public class Diagram {
    public static void main(String[] args) {
        shape c=new circle(10);
        shape r=new rectangle(2,4);

        c.calculate_area();
        c.display();
        r.calculate_area();
        r.display();



    }
}
