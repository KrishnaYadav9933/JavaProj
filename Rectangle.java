import java.util.Scanner;
public class Rectangle {
    static void rectangle1(int a, int b){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void rectangle2(int a, int b){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i == 1 || i==a || j==1 || j==b){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    static void rectangle3(int a, int b){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i == a/2+1 && j == b/2+1){
                    System.out.print("  ");
                }
                else{
                System.out.print("* ");}
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle : ");
        int l = scan.nextInt();
        System.out.println("Enter the breadth of Rectangle : ");
        int b= scan.nextInt();
        //rectangle1(l, b);
        //rectangle2(l,b);
        rectangle3(l,b);
    }
}
