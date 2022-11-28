import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number:  ");
        int number = input.nextInt();
        System.out.println("");
        for (int stepIndex = number; stepIndex >0 ; stepIndex--) {
            for (int i = 0; i < (number - stepIndex); i++) {
                System.out.print(" ");
            }

            for (int charIndex = 0; charIndex < (2*stepIndex-1); charIndex++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}