import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final float PRICE_PEAR = 2.14f, PRICE_APPLE = 3.67f, PRICE_TOMATO = 1.11f, PRICE_BANANA = 0.95f, PRICE_EGGPLANT = 5.00f, totalPrice;
        int kgPear, kgApple, kgTomato, kgBanana, kgEggplant;

        Scanner input = new Scanner(System.in);

        System.out.print("How many kg of pear ? : ");
        kgPear = input.nextInt();

        System.out.print("How many kg of apple ? : ");
        kgApple = input.nextInt();

        System.out.print("How many kg of tomato ? : ");
        kgTomato = input.nextInt();

        System.out.print("How many kg of banana ? : ");
        kgBanana = input.nextInt();

        System.out.print("How many kg of eggplant ? : ");
        kgEggplant = input.nextInt();

        totalPrice = PRICE_PEAR * kgPear
                + PRICE_APPLE * kgApple
                + PRICE_TOMATO * kgTomato
                + PRICE_BANANA * kgBanana
                + PRICE_EGGPLANT * kgEggplant;

        System.out.println("Total price : " + totalPrice + " TL");
    }
}
