
import java.util.Scanner;
public class spiralMatrix {
    static void printSpiralMat(int [][] A, int r, int c){
        int ur=0, br=r-1, lc=0, rc=c-1;
        int totalCount = 0;
        while(totalCount<r*c){
            for(int j=lc; j<=rc && totalCount<r*c; j++){
                System.out.print(A[ur][j]+" ");
                totalCount++;
            }
            ur++;
            for(int i=ur; i<=br && totalCount<r*c; i++){
                System.out.print(A[i][rc]+" ");
                totalCount++;

            }
            rc--;
            for(int j=rc; j>=lc && totalCount<r*c; j--){
                System.out.print(A[br][j]+" ");
                totalCount++;

            }
            br--;
            for(int i=br; i>=ur && totalCount<r*c; i--){
                System.out.print(A[i][lc]+" ");
                totalCount++;

            }
            lc++;


        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the order of matrix: ");
        int r = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("Enter the value of "+r*c+" numbers: ");
        int [][] matrix = new int [r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=scan.nextInt();
            }

        }
        printSpiralMat(matrix, r, c);
    }
}
