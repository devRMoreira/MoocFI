
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = 0;
        int last = 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("From where?");
        first = Integer.valueOf(scanner.nextLine());

        System.out.println("To where?");
        last = Integer.valueOf(scanner.nextLine());

        for (int i = first; i <= last; i++){
            System.out.println(numbers.get(i));
        }


    }
}
