import java.util.*;
public class priceN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item, price, paid;
        int total = 0;
        System.out.print("Enter number of items: ");
        item = sc.nextInt();
        for (int i = 1; i < item + 1; i++) {
            System.out.print("Enter price for item " + i + ": ");
            price = sc.nextInt();
            total += price;
        }
        System.out.println("Total = " + total);
        System.out.println("");
        System.out.print("Enter amount paid: ");
        paid = sc.nextInt();
        paid -= total;
        System.out.println("Change = " + paid);
    }
}
