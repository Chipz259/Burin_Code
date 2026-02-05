import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int odd = 0;
        int even = 0;
        num = sc.nextInt();
        while (num != -1) {
            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            num = sc.nextInt();
        }
        System.out.println("Odd number = " + odd + " Even number = " + even);
    }
}
