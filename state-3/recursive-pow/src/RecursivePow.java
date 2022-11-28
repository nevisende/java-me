public class RecursivePow {
    public static int getPow(int x, int y){
        if(y == 0) return 1;
        return x * getPow(x,y-1);
    }

}
