import java.util.Scanner;
public class pyramid {
    static void pyramid1(int r){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pyramid2(int r){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=2*(r-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pyramid : ");
        int r = scan.nextInt();
        //pyramid1(r);
        pyramid2(r);
    }
}
