import java.util.Scanner;

public class SectorArea {
    public static void main(String[] args) {
        final float PI = 3.14f;
        double area;
        int radius, angle;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextInt();

        System.out.print("Enter the angle of the circle: ");
        angle = input.nextInt();

        area = (PI * (radius * radius) * angle) / 360;
        System.out.println("The area of the sector of the circle: " + area);


    }
}
