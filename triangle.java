import java.util.Scanner;
public class triangle {
    static void triangle1(int r){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void triangle2(int r){
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of row of triangle : ");
        int r = scan.nextInt();
        //triangle1(r);
        triangle2(r);
    }
}
