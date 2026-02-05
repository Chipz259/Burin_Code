import java.util.*;
public class scoreN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student, score;
        int ex = 0;
        int good = 0;
        int fair = 0;
        int poor = 0;
        System.out.print("Enter numer of students: ");
        student = sc.nextInt();
        for (int i = 1; i < student + 1; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextInt();
            if (score >= 80){
                System.out.println("Excellent");
                ex += 1;
            } else if (60 <= score && score <= 79) {
                System.out.println("Good");
                good += 1;
            } else if (50 <= score && score <= 59) {
                System.out.println("Fair");
                fair += 1;
            } else {
                System.out.println("Poor");
                poor += 1;
            }
        }
        System.out.println("");
        System.out.println("Summary");
        System.out.println("Excellent: " + ex);
        System.out.println("Good: " + good);
        System.out.println("Fair: " + fair);
        System.out.println("Poor: " + poor);
    }
}
