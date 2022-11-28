public class InteractToUser {
    static Console console = new Console();

    InteractToUser(){
        String welcome = "<  Welcome to my Recursive Pow program  >";
        console.printHyphen(welcome.length());
        console.println(welcome);
        console.printHyphen(welcome.length());
        console.breakLine();
    }

    public void runMainFunc(){
        int baseNumber = console.askAndGetIntValue("Enter the base number: ");
        int powerNumber = console.askAndGetIntValue("Enter the power number: ");
        int result = RecursivePow.getPow(baseNumber, powerNumber);
        console.println(baseNumber + " ^ " + powerNumber + " = " + result);
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
