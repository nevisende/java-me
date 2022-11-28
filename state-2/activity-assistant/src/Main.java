import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the air temperature: ");
        temperature = input.nextInt();

        if(temperature < 5) {
            System.out.println("You can ski.");
        } else if (temperature >= 25) {
            System.out.println("You can swim.");
        } else {
            if(temperature >= 15) {
                System.out.println("You can have a picnic.");
            }else {
                System.out.println("You can go to the cinema.");
            }
        }
    }
}
