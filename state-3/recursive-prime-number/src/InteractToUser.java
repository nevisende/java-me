public class InteractToUser {
    static Console console = new Console();
    RecursivePrimeNumber recursivePrimeNumber = new RecursivePrimeNumber();

    InteractToUser(){
        String welcome = "<  Welcome to my Recursive Prime number program  >";
        console.printHyphen(welcome.length());
        console.println(welcome);
        console.printHyphen(welcome.length());
        console.breakLine();
    }

    public void runMainFunc(){
        int userNumber = console.askAndGetIntValue("Enter any number: ");
        recursivePrimeNumber.setUserNumber(userNumber);
        recursivePrimeNumber.printResult();
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
