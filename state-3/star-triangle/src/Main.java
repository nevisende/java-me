import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height number of the top triangle: ");
        int stepNumber = input.nextInt();

        for (int stepIndex = 0; stepIndex < stepNumber; stepIndex++){
            for (int i = 0; i < (stepNumber - stepIndex); i++) {
                System.out.print(" ");
            }
            for(int charIndex = 1; charIndex <= (stepIndex * 2 + 1); charIndex++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int stepIndex = stepNumber-1; stepIndex > 0; stepIndex--){
            for (int i = (stepNumber - stepIndex+1); i > 0 ; i--) {
                System.out.print(" ");
            }
            for(int charIndex = 1; charIndex < (stepIndex * 2 ); charIndex++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}