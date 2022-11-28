public class PatternMethod {
    Console console = new Console();
    public void print(int userNumber, int recursiveNumber, int addedNumber){
        console.print(recursiveNumber + " ");
        if(userNumber == recursiveNumber) {
            return;
        }


        if(recursiveNumber<=0) {
            addedNumber = 5;
        }

        recursiveNumber += addedNumber;

        print(userNumber, recursiveNumber, addedNumber);
    }

}
