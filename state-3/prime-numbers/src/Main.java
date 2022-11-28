import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Check the numbers from 1 to : ");
        int number = input.nextInt();
        System.out.print("Prime numbers : ");
        for (int i = 1; i <= number ; i++) {
            if(isPrime(i)) System.out.print(i + " ");
        }
    }
    public static boolean isPrime(int number){
        if( number < 2) return false;

        for (int i = 2; i < number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}