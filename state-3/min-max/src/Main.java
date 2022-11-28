import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;

        System.out.print("How many number you want to enter: ");
        int counter = input.nextInt();

        long currentEnteredNumber;
        for (long i = 1; i <= counter; i++) {
            System.out.print("Enter the " + i+ ". number: " );
            currentEnteredNumber = input.nextLong();
            if(currentEnteredNumber > max ) max = currentEnteredNumber;
            if(currentEnteredNumber < min) min = currentEnteredNumber;
        }

        System.out.println("Highest number: " + max);
        System.out.println("Lowest number :" + min);
    }
}