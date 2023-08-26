import java.util.Scanner;

public class printNum {
    static void printNumber(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printNumber(n-1);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n = scan.nextInt();
        printNumber(n);
    }
}
