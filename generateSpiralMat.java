import java.util.Scanner;

//take n*n matrix and print 1 to n*n in spiral order
public class generateSpiralMat {
    static void generateSpiralMat(int n){
        int [][] M = new int [n][n];
        int ur=0, br=n-1, lc=0, rc=n-1 ;
        int count=1;
        while(count<=n*n) {
            for (int j = lc; j <= rc && count <= n * n; j++) {
                M[ur][j] = count++;
            }
            ur++;
            for (int i = ur; i <= br && count <= n * n; i++) {
                M[i][rc] = count++;
            }
            rc--;
            for (int j = rc; j >= lc && count <= n * n; j--) {
                M[br][j] = count++;
            }
            br--;
            for (int i = br; i >= ur && count <= n * n; i--) {
                M[i][lc] = count++;
            }
            lc++;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the order of matrix: ");
        int r = scan.nextInt();
        generateSpiralMat(r);
    }
}
