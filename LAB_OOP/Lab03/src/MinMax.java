import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int max = 0;
        int min = 0;
        System.out.print("Enter a number (-1 to stop): ");
        num = sc.nextInt();
        max = num;
        min = num;
        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("");
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
