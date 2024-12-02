
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> fileSearch = new ArrayList<>();

        try (Scanner fileRead = new Scanner(Paths.get(file))) {

            while (fileRead.hasNextLine()){
                fileSearch.add(fileRead.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

         if (fileSearch.contains(searchedFor)){
             System.out.println("Found!");
         } else {
             System.out.println("Not found.");
         }
        /*for (String name : fileSearch){

            if (name.equals(searchedFor)){
                System.out.println("Found!");
            }
        }*/

    }
}
