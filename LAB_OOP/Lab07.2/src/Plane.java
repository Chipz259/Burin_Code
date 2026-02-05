public class Plane extends Vehicle implements Flyable {
    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;
    public Plane() {
        fuel = 0.0;
        airline = "";
        boeing = "";
    }
    public Plane(double fuel, String airline, String boeing) {
        this.fuel = fuel;
        this.airline = airline;
        this.boeing = boeing;
    }
    public String getAirline() {
        return airline;
    }
    public String getBoeing() {
        return boeing;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }
    public void setBoeing(String boeing) {
        this.boeing = boeing;
    }
    public void fly() {
        if (fuel >= 20) {
            fuel -= 20;
            System.out.println("Plane Fly");
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }
    public void honk() {
        System.out.println("Weeeeeee");
    }
    public void landing() {
        if (fuel >= 10) {
            fuel -= 10;
            System.out.println("Plane Already to Landing");   
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }
    public void startEngine() {
        if (fuel >= 20) {
            fuel -= 20;
            System.out.println("Plane’s Engine starts");   
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine() {
        System.out.println("Plane’s Engine stops");
    }
    public void takeOff() {
        if (fuel >= 10) {
            fuel -= 10;
            System.out.println("Plane Already to Take Off");   
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }
}
