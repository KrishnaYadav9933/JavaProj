import java.util.Scanner;

public class pascalTriangle {
    static void pascal(int n){
        int [][] p = new int [n][];
        for(int i=0; i<n; i++){
            p[i]= new  int[i+1];
            p[i][0]=1;
            p[i][i]=1;
            for(int j=1; j<i; j++){
            p[i][j]=p[i-1][j]+p[i-1][j-1];
            }
}
        printMatrix(p,n);
}
static void printMatrix(int [][] p, int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print(p[i][j] + " ");
        }
        System.out.println();
    }
}
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of pascal triangle :");
        int n= scan.nextInt();
        pascal(n);
}
}