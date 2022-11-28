public class InteractToUser {
    static Console console = new Console();
    RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();

    InteractToUser(){
        String welcome = "<  Welcome to my Recursive Fibonacci program  >";
        console.printHyphen(welcome.length());
        console.println(welcome);
        console.printHyphen(welcome.length());
        console.breakLine();
    }

    public void runMainFunc(){
        int number = console.askAndGetIntValue("Enter the step number of Fibonacci series: ");
        recursiveFibonacci.printUpToXNumber(number);
        console.breakLine(2);
    }

    public void mainFuncLoop(){
        int terminalStationCode = 1;
        while (terminalStationCode == 1) {
            runMainFunc();

            int answer = console.askAndGetIntValue("To quit enter 0 (zero) otherwise you can enter any number : ");
            if(answer == 0){
                terminalStationCode =0;
                console.println("Thank you for using my program.");
            }
            console.breakLine();
        }
    }


}
