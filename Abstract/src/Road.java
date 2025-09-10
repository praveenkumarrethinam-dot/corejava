abstract class vehicle{
    String vehicle_type;
    String status;
    abstract void start(String vehicle_type);
    abstract void stop(String status);
}
class car extends vehicle{
    void start(String vehicle_type) {
        super.vehicle_type = "car";
        System.out.println(vehicle_type + "start by key");
    }
    void stop(String status){
        super.status="stopped";
        System.out.println("the car was"+status);
    }
}
class bike extends vehicle{
    void start(String vehicle_type){
        super.vehicle_type="bike";
        System.out.println(vehicle_type+"start by key");
    }
    void stop(String status){
        super.status="stopped";
        System.out.println("the bike was"+status);
    }}
class truck extends vehicle {
    void start(String start) {
        super.vehicle_type = "truck";
        System.out.println(vehicle_type + "start by key");
    }
    void stop(String status){
        super.status="stopped";
        System.out.println("the truck was"+status);
    }}
public class Road {
    public static void main(String[] args) {
        vehicle car=new car();
        vehicle bike=new bike();
        vehicle truck=new truck();

        car.start("car");
        car.stop("stopped");
        bike.start("bike");
        bike.stop("stopped");
        truck.start("truck");
        truck.stop("stopped");
    }
}
