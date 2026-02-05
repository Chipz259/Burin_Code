import java.util.*;
public class AtoY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        char ch;
        String all = "";
        String con = "";
        while (true){
            System.out.print("Enter a character: ");
            input = sc.nextLine();
            if (input.length() != 1) {
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
            }
            ch = input.charAt(0);
            if (ch < 'a' || ch > 'z') {
                System.out.println("Invalid input. Only lowercase a-z are allowed");
                continue;
            }
            if (ch == 'z') {
                break;
            }
            if ("aeiou0123456789".indexOf(ch) == -1) {
                con += ch;
            }
            all += ch;
        }
        System.out.println("All characters entered: " + all);
        System.out.println("Consonants only: " + con);
    }
}
