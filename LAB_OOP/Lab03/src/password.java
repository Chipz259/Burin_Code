import java.util.*;
public class password {
    public static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password : ");
        password = sc.nextLine();
        while (!password.equals("PASS2025")) {
            System.out.print("Enter password : ");
            password = sc.nextLine();
        }
    }
}
