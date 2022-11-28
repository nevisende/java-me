import java.util.Scanner;

import static java.lang.System.*;

public class Console {
    protected final Scanner input = new Scanner(in);

    public int askAndGetIntValue(String question) {
        out.print(question);
        return input.nextInt();
    }

    public void println(String x){
        out.println(x);
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


