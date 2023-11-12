
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int lowerLimit = 0;
        int upperLimit = 0;

        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }

            numbers.add(input);
        }

        System.out.println("Upper limit?");
        upperLimit = Integer.valueOf(scanner.nextLine());
        System.out.println("Lower limit?");
        lowerLimit = Integer.valueOf(scanner.nextLine());
        printNumbersInRange(numbers, lowerLimit, upperLimit);

    }


    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int number: numbers){

            if (number >= lowerLimit && number <= upperLimit){
                System.out.println(number);
            }
        }
    }
}
