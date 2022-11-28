public class RecursiveFibonacci {
    public int fibonacci(int n){
        if(n==1 || n==2)  return 1;

        return  fibonacci(n-1) + fibonacci(n-2);
    }
    public void printUpToXNumber(int X){
        for(int i = 1; i <= X; i++){
            int f = fibonacci(i);
            System.out.print(f + " ");
        }

    }

}
