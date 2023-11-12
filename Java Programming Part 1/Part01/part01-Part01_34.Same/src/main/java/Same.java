
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String w1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String w2 = scan.nextLine();

        if (w1.equals(w2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
