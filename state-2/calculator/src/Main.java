import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        firstNumber = input.nextInt();

        System.out.print("Enter the second number : ");
        secondNumber = input.nextInt();


        System.out.println("1-Plus\n2-Minus\n3-Multiplication\n4-Division");
        System.out.print("Your choice: ");
        select = input.nextInt();

        switch (select) {
            case 1 -> System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
            case 2 -> System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
            case 3 -> System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
            case 4 -> {
                if(secondNumber != 0) {
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                } else System.out.println("You can't divide by 0");
            }
            default -> System.out.println("Please select an valid option");
        }
    }
}
