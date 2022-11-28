import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, bmi;
        int weight;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height in metre: ");
        height = input.nextDouble();

        System.out.print("Please enter your height in kg: ");
        weight = input.nextInt();

        bmi = weight/(height * height);
        System.out.println("Your body mass index: " + bmi);

    }
}