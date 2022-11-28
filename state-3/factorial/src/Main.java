import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("To calculate  the number of combinations --->");

        System.out.print("Enter the total number of objects in the set: ");
        int totalNumberObject = input.nextInt();

        preventIssueSkipScanner();
        breakLine();

        System.out.print("Enter the number of choosing objects from the set: ");
        int numberChoosingObject = input.nextInt();
        breakLine();

        int combinationNumber = calculateCombination(totalNumberObject, numberChoosingObject);
        System.out.println("Combination number: " + combinationNumber);
    }

    public static int getFactorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial *=i;
        }
        return factorial;
    }

    public static int calculateCombination(int totalNumberObject, int numberChoosingObject){
        return getFactorial(totalNumberObject)
                /(getFactorial(numberChoosingObject)*getFactorial(totalNumberObject-numberChoosingObject));
    }

    public static void breakLine(){
        System.out.println("");
    }

    public static void preventIssueSkipScanner(){
        input.nextLine();
    }
}