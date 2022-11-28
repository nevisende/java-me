import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 1;

        System.out.print("Enter any number : ");
        int number = input.nextInt();

        System.out.print("Enter the exponent number : ");
        int exponentNumber = input.nextInt();

        for (int i = 1; i <= exponentNumber; i++) {
            result *= number;
        }

        System.out.println(number + " ^ " + exponentNumber +" = " + result);
    }
}