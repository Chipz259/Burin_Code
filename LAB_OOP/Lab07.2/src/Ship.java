public class Ship extends Vehicle implements Floatable {
    public Ship() {
        
    }
    public Ship(double fuel) {
        this.fuel = fuel;
    }
    public void fl0at() {
        if (fuel >= 50) {
            this.fuel -= 50;
            System.out.println("Ship moves");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    public void honk() {
        System.out.println("Shhhhh");
    }
    public void move() {
        fl0at();
    }
    public void move(int distance) {
        for (int i = 0; i < distance; i++) {
            if (fuel < 50) {
                System.out.println("Fuel is not enough.");
                break;
            }
            fl0at();
        }
    }
    public void startEngine() {
        if (fuel >= 10) {
            this.fuel -= 10;
            System.out.println("Engine starts");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine() {
        System.out.println("Engine stops");
    }
}
