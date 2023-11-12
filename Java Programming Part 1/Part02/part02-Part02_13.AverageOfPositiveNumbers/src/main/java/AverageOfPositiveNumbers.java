
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posCount = 0;
        int sum = 0;

        while (true){
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0 && posCount == 0){
                System.out.println("Cannot calculate the average");
                break;
            }

            if (num == 0 && posCount !=0) {
                System.out.println((1.0*sum) / posCount);
                break;
            }

            if (num > 0) {
                posCount++;
                sum = sum + num;
                continue;
            }

            if (num < 0) {
                continue;
            }

        }

    }
}
