import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int total = 0;

        while(number%2 ==0) {
            System.out.print("Enter a number (greater than 0) : ");
            number = input.nextInt();
            if(number % 4 == 0) {
                total += number;
                System.out.println("Total " + total);
            }
        }
    }
}