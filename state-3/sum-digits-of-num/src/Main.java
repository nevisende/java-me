import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sumDigits = 0;

        System.out.print("Enter any number: ");
        long number = input.nextLong();

        while(number != 0){
            sumDigits += number % 10 ;
            number /= 10;
        }

        // To get correct result from  negative numbers
        if(sumDigits < 0) sumDigits *= -1;

        System.out.print("The sum of the digits of your number: " + sumDigits);
    }
}