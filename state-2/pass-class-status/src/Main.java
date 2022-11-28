import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int mathGrade, physicGrade, turkishGrade, chemicalGrade,
            musicGrade, countedLesson = 0;

    public static void main(String[] args) {
        String[] lessons = {"math","turkish","physic","chemical","music"};

        for(String lesson : lessons) {
            setLessonGrade(lesson);
        }

        int totalGrade = mathGrade + turkishGrade + physicGrade + chemicalGrade + musicGrade;
        float average = (float) totalGrade / countedLesson;

        System.out.println("Average: " + average);

        if(average >= 55 ) {
            System.out.println("Congratulations, you passed!");
        } else {
            System.out.println("Sorry, you failed!");
        }
    }

    public static void setLessonGrade(String lesson){
        System.out.print("Your " + lesson + " grade(0-100): ");
        int inputValue = input.nextInt();
        if(inputValue >= 0 && inputValue <=100) {
            switch (lesson) {
                case "math" -> {
                    mathGrade = inputValue;
                    countedLesson++;
                }
                case "turkish" -> {
                    turkishGrade = inputValue;
                    countedLesson++;
                }
                case "physic" -> {
                    physicGrade = inputValue;
                    countedLesson++;
                }
                case "chemical" -> {
                    chemicalGrade = inputValue;
                    countedLesson++;
                }
                case "music" -> {
                    musicGrade = inputValue;
                    countedLesson++;
                }
            }
        } else {
            System.out.println("Please type a valid grade!");
            setLessonGrade(lesson);
        }
    }
}
