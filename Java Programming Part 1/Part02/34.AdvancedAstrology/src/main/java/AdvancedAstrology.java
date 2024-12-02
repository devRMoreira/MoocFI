
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 1; i <=number;i++) {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i=number; i >= 1;i--) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        int stars = 1;

        while ( i <= size){
            printSpaces(size-1);
            printStars(stars);
            size--;
            stars++;
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int treeStars = 1;
        int treeSpaces = height-1;

        for (int i = 1; i <=height; i++){
            printSpaces(treeSpaces);
            printStars(treeStars);
            treeSpaces--;
            treeStars = treeStars + 2;
        }

        for(int i = 1;i <= 2; i++){
            printSpaces(height-2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
