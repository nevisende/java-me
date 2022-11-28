import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstLeg, secondLeg;
        double hypotenuse;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first leg(a): ");
        firstLeg = scanner.nextInt();

        System.out.print("Enter the length of the second leg(b): ");
        secondLeg = scanner.nextInt();

        hypotenuse = Math.sqrt((firstLeg*firstLeg) + (secondLeg*secondLeg));

        System.out.println("The Hypotenuse is: " + hypotenuse);
    }
}
