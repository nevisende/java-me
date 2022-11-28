import java.util.Scanner;

import static java.lang.System.*;

public class Console {
    protected final Scanner input = new Scanner(in);
    public void preventSkipScannerIssue(){
        input.nextLine();
    }

    public int askAndGetIntValue(String question) {
        out.print(question);
        return input.nextInt();
    }

    public long askAndGetLongValue(String question) {
        out.print(question);
        return input.nextLong();
    }

    public double askAndGetDoubleValue(String question) {
        out.print(question);
        return input.nextDouble();
    }

    public String askAndGetStringValue(String question) {
        out.print(question);
        return input.nextLine();
    }

    public void println(String x){
        out.println(x);
    }
    public void printlnXisY(String X, String Y){
        out.println(X + "  " + Y);
    }

    public void breakLine(){
        out.println();
    }
    public void breakLine(int lineNumber){
        for (int i = 0; i < lineNumber; i++) {
            out.println();
        }
    }

    public void printHyphen(int times){
        out.println("-".repeat(Math.max(0, times)));
    }
}


