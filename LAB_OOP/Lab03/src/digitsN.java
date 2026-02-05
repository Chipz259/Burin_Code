import java.util.*;
public class digitsN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int digit;
        String result = "";
        System.out.print("Enter number of digits: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter digit " + i + ": ");
            digit = sc.nextInt();
            result += digit;
        }
        System.out.println("Final Code = " + result);
    }
}
