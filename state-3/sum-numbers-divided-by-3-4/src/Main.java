import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (greater than 0) : ");
        int number = input.nextInt();

        List<Integer> numberList = new ArrayList<>();

        if(number > 0){
            for (int checkNumber = 1; checkNumber <= number; checkNumber++){
                if((checkNumber % 3 == 0) || (checkNumber % 4 == 0)){
                    numberList.add(checkNumber);
                }
            }
        } else {
            System.out.println("You entered wrong type!");
        }

        int numbersTotal= numberList.stream().reduce(0, Integer::sum);
        double averageNumbers = (double) numbersTotal/numberList.size();

        System.out.println("The average of numbers divided 3 or 4 is : " + averageNumbers);
    }
}