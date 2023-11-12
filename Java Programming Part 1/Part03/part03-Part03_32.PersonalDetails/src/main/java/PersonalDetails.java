
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length=0, count=0, sum=0;
        String longest = "";

        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            count++;
            String[] split = input.split(",");
            sum = sum + Integer.valueOf(split[1]);

            if(split[0].length() > length){
                length = split[0].length();
                longest = split[0];
            }
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (1.0*sum) / count);



    }
}
