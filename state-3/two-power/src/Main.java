import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        breakLine();
        loopPowerOfXUptoY(4,num);
        breakLine();
        breakLine();
        loopPowerOfXUptoY(5,num);

    }

    public static void loopPowerOfXUptoY(int X, int Y){
        int currentNum = X;
        System.out.print("The powers of " + X+" : ");
        while(currentNum <= Y){
            System.out.print(" "+ currentNum);
            currentNum *=X;
        }
    }

    static void breakLine(){
        System.out.println("");
    }
}