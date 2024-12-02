
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = "";

        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            String[] split = input.split(",");

            if(Integer.valueOf(split[1]) > oldestAge){
                oldestAge = Integer.valueOf(split[1]);
                oldestName = split[0];
            }
        }

        System.out.println("Name of the oldest: " + oldestName);
    }
}
