import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int birthMonth, birthDay;

    public static void main(String[] args) {
        String zodiacSign;

        birthMonth = askAndGetIntValue("The month you were born: (Type in number): ");
        while(birthMonth < 1 || birthMonth > 12) {
            System.out.println("You entered an invalid number for months ! Please type again.");
            birthMonth = askAndGetIntValue("The month that you were born: (in number): ");
        }

        birthDay =  askAndGetIntValue("The day you were born: ");
        while (birthDay < 1 || birthDay > 31) {
            System.out.println("You entered an invalid number for days ! Please type again.");
            birthDay =  askAndGetIntValue("The day you were born: ");
        }

        zodiacSign = getZodiacSign(birthMonth, birthDay);
        System.out.println("Your zodiac sign: " + zodiacSign);
    }

    public static int askAndGetIntValue(String question) {
        System.out.print(question);
        return input.nextInt();
    }

    public static String getZodiacSign(int birthMonth, int birthDay) {
        if(birthMonth == 3 && birthDay >= 21 || birthMonth == 4 && birthDay <= 19) return "Aries";
        if(birthMonth == 4 || birthMonth == 5 && birthDay <= 20) return "Taurus";
        if(birthMonth == 5 || birthMonth == 6 && birthDay <= 20) return "Gemini";
        if(birthMonth == 6 || birthMonth == 7 && birthDay <= 22) return "Cancer";
        if(birthMonth == 7 || birthMonth == 8 && birthDay <= 22) return "Leo";
        if(birthMonth == 8 || birthMonth == 9 && birthDay <= 22) return "Virgo";
        if(birthMonth == 9 || birthMonth == 10 && birthDay <= 22) return "Libra";
        if(birthMonth == 10 || birthMonth == 11 && birthDay <= 21) return "Scorpio";
        if(birthMonth == 11 || birthMonth == 12 && birthDay <= 21) return "Sagittarius";
        if(birthMonth == 12 || birthMonth == 1 && birthDay <= 19) return "Capricorn";
        if(birthMonth == 1 || birthMonth == 2 && birthDay <= 18) return "Aquarius";
        if(birthMonth == 2 && birthDay <= 29|| birthMonth == 3) return "Pisces";
        return null;
    }
}
