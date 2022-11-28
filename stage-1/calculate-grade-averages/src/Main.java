import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short mathGrade, physicsGrade , chemistryGrade, turkishGrade, historyGrade, musicGrade;

        System.out.print("Your math grade: ");
        mathGrade = scanner.nextShort();

        System.out.print("Your physics grade: ");
        physicsGrade = scanner.nextShort();

        System.out.print("Your chemistry grade: ");
        chemistryGrade = scanner.nextShort();

        System.out.print("Your Turkish grade: ");
        turkishGrade = scanner.nextShort();

        System.out.print("Your history grade: ");
        historyGrade = scanner.nextShort();

        System.out.print("Your music grade: ");
        musicGrade = scanner.nextShort();

        short numberOfLesson = 6;
        short totalGrade = (short) (mathGrade + physicsGrade + chemistryGrade + turkishGrade + historyGrade + musicGrade);
        float averageGrade =  (float) totalGrade / numberOfLesson;

        System.out.println("Your average grade: " + averageGrade);

        if(averageGrade >= 60) System.out.println("Sınıfı geçti!");
        if(averageGrade < 60) System.out.println("Sınıfta kaldı!");

    }
}
