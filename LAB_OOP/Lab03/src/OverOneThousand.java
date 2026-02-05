import java.util.*;
public class OverOneThousand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount;
        int total = 0;
        int count = 0;
        while (total < 1000) {
            System.out.print("Enter deposit amount: ");
            amount = sc.nextInt();
            total += amount;
            count++;
        }
        System.out.println("");
        System.out.println("Target reach!");
        System.out.println("Total amount saved = " + total);
        System.out.println("Number of deposits = " + count);
    }
}
