public class RecursivePrimeNumber {
    int userNumber;
    Console console = new Console();

    public void setUserNumber(int userNumber){
        this.userNumber = userNumber;
    }

    private boolean isPrime(int divideNumber){
        if(divideNumber == 1) {
            return true;
        }
        if(userNumber % divideNumber == 0 ) return false;

        return isPrime(divideNumber-1);
    }

    public void printResult(){
        int firstDivideNumber = userNumber-1;
        if(isPrime(firstDivideNumber)) console.printlnXisY(String.valueOf(userNumber)," is a prime number.");
        else console.printlnXisY(String.valueOf(userNumber)," is not a prime number.");
    }

    

}
