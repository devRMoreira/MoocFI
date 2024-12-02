
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalNumbers = 0;
        int totalEven = 0;
        int totalOdd = 0;

        System.out.println("Give numbers:");

        while (true){

            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1){
                break;
            }

            if (num != -1 && num > -1){
                sum +=num;
                totalNumbers++;

                if (num % 2 == 0){
                    totalEven++;
                } else {
                    totalOdd++;
                }

                continue;
            }


        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average: " + 1.0*sum / totalNumbers);
        System.out.println("Even: " + totalEven);
        System.out.println("Odd: " + totalOdd);

    }
}
