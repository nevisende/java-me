import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159265359;
        double area, circumference;
        int radius;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextInt();

        circumference = 2 * PI * radius;
        area = PI * radius * radius;

        System.out.println("The circumference of the circle: " + circumference);
        System.out.println("The area of the circle: " + area);
    }
}
