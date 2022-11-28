import java.util.Scanner;

public class HeronMain {
    public static void main(String[] args) {
        int firstSide, secondSide, thirdSide;
        double semiPerimeter, area;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first side(a): ");
        firstSide = scanner.nextInt();

        System.out.print("Enter the length of the second side(b): ");
        secondSide = scanner.nextInt();

        System.out.print("Enter the length of the third side(c): ");
        thirdSide = scanner.nextInt();

        semiPerimeter = (double) (firstSide + secondSide + thirdSide) /2;
        area = Math.sqrt(
                semiPerimeter
                * (semiPerimeter-firstSide)
                * (semiPerimeter-secondSide)
                *(semiPerimeter-thirdSide)
        );

        System.out.println("The area is: " + area);
    }
}
