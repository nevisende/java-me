import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 1;
        int temp;

        System.out.print("How many element you want to see: ");
        int elementNumber = input.nextInt();


        System.out.print("Fibonacci series : 0 1 ");
        for (int i = 2; i < elementNumber ; i++) {
            temp = secondNumber;
            secondNumber = firstNumber + secondNumber;
            firstNumber = temp;
            System.out.print(secondNumber + " ");
        }
    }
}