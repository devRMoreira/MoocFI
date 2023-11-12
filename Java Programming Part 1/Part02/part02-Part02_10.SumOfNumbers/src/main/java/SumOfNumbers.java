
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int result = 0;


        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num < 0 || num > 0 ){
                result = sum + num;
                sum = result;
                continue;
            }

            if (num == 0){
                System.out.println("Sum of the numbers: " + result);
                break;
            }

        }
    }
}
