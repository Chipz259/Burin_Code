public class Food {
    private static double price = 50;
    private final static int energy = 10;
    public static int getEnergy() {
        return energy;
    }
    public static double getPrice() {
        return price;
    }
    public static void setPrice(double price) {
        if (price > getPrice()) {
            price = getPrice();
        } else {
            System.out.println("Cannot update the food price.");
        }
    }
}
