import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int birtYear = askAndGetIntValue("Enter your birth year : ");

        String chineseZodiacSign = getChineseZodiacSign(birtYear);
        System.out.println("Your Chinese Zodiac Sign : " + chineseZodiacSign.toUpperCase());

    }

    public static int askAndGetIntValue(String question) {
        System.out.print(question);
        return input.nextInt();
    }

    public static String getChineseZodiacSign(int birthYear) {
       int remainder = birthYear % 12;

        return switch (remainder) {
            case 0 -> "Monkey";
            case 1 -> "Rooster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Rat";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            case 11 -> "Sheep";
            default -> null;
        };
    }
}
