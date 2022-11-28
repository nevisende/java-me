import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber;

        System.out.print("Type first number: ");
        firstNumber = input.nextInt();

        System.out.print("Type second number: ");
        secondNumber = input.nextInt();

        System.out.print("Type third number: ");
        thirdNumber = input.nextInt();

        printSorted(firstNumber, secondNumber, thirdNumber);
    }

    public static void printSorted(int firstNumber, int secondNumber, int thirdNumber){
        int minNumber = getMinNumberBetweenTwoNumbers(getMinNumberBetweenTwoNumbers(firstNumber, secondNumber),thirdNumber);
        int maxNumber = getMaxNumberBetweenTwoNumbers(getMaxNumberBetweenTwoNumbers(firstNumber, secondNumber),thirdNumber);
        int midNumber = (firstNumber + secondNumber + thirdNumber) - minNumber - maxNumber;

        System.out.println("" + maxNumber + " > " + midNumber + " > " + minNumber);
    }

    public static int getMinNumberBetweenTwoNumbers(int numberOne, int numberTwo) {
        if(numberOne < numberTwo) return numberOne;
        return numberTwo;
    }

    public static int getMaxNumberBetweenTwoNumbers(int numberOne, int numberTwo) {
        if(numberOne > numberTwo) return numberOne;
        return numberTwo;
    }
}
