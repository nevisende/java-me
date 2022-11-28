import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = askAndGetIntValue("Enter a year : ");
        isLeapYear(year);
    }

    public static int askAndGetIntValue(String question) {
        Scanner input = new Scanner(System.in);
        System.out.print(question);
        return input.nextInt();
    }

    public static void isLeapYear(int year) {
        if((year % 100 == 0) && (year % 400 != 0)) System.out.println("It is not a leap year!");
        else if((year % 4 == 0)) System.out.println("It is a leap year!");
        else System.out.println("It is not a leap year!");
    }
}
