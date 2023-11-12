
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalInputs = 0;
        int sum = 0;


        while (true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if (num < 0 || num > 0){
                sum = sum + num;
                totalInputs++;
                continue;
            }

            if (num == 0){
                System.out.println("Average of the numbers: " + (1.0*sum)  / totalInputs);
                break;
            }
        }

    }
}
