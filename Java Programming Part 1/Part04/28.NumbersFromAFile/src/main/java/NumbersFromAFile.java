import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> numbersList = new ArrayList<>();

        try (Scanner fileRead= new Scanner(Paths.get(file))){

            while (fileRead.hasNextLine()){
                numbersList.add(Integer.valueOf(fileRead.nextLine()));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        for(int number : numbersList){
            if (number >= lowerBound && number <= upperBound){
                counter++;
            }
        }

        System.out.println("Numbers: " + counter);
    }

}
