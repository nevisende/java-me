import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n1 number: ");
        int n1 = input.nextInt();

        System.out.print("Enter the n2 number: ");
        int n2 = input.nextInt();

        int temp = n1;
        int hcf  = 1;
        System.out.print("HCF : ");
        while(temp >= 1){
            if(( n1 % temp == 0) && n2 % temp == 0){
                hcf = temp;
                System.out.println(hcf + " ");
                break;
            }
            temp--;
        }

        System.out.print("Icm : ");
        temp = 1;
        while(temp < n1 * n2){
            if(( temp% n1 == 0) && (temp % n2 ) == 0){
                System.out.print(temp + " ");
            }
            temp++;
        }
    }
}