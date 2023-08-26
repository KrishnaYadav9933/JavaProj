import java.util.Scanner;
public class Transpose {
    static void reverseArray(int [] Arr){
        int i=0; int j=Arr.length-1;
        while(i<j){
            int temp = Arr[i];
            Arr[i]=Arr[j];
            Arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateMatrix(int [][] Arr, int n){
        transposeInPlace(Arr, n);
        for(int i=0; i<n; i++){
            reverseArray(Arr[i]);
        }
        printMatrix(Arr, n, n);
    }
    static void printMatrix(int[][] A, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("These matrices cann't be added. ");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum, r1, c1);
    }

    static void multiplyMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("These matrices cann't be multiply ");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printMatrix(mul, r1, c2);
    }

    static void transpose(int[][] A, int r, int c) {
        int[][] t = new int[c][r];
        for (int i = 0; i < c; i++) {
        for (int j=0; j<r; j++) {
            t[i][j] = A[j][i];
        }

        }
        printMatrix(t, c, r);
    }
    static void transposeInPlace(int [][] Arr, int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = Arr[i][j];
                Arr[i][j]=Arr[j][i];
                Arr[j][i] = temp;
            }
        }
        printMatrix(Arr, n, n);
    }
    public static void main(String [] args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the size of first matrix : ");
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int [][] M = new int [r1][c1];
        System.out.println("Enter the "+r1*c1+" elements of first matrix : ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                M[i][j]=scan.nextInt();
            }
        }
        /*
        System.out.println("Enter the size of second matrix : ");
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        System.out.println("Enter the "+r2*c2+" elements of second matrix : ");
        int [][] N = new int [r2][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                N[i][j]=scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("First matrix : ");
        printMatrix(M, r1, c1);
        System.out.println();
        System.out.println("Transpose of First Matrix : ");
        transpose(M, r1, c1);
        System.out.println();
        System.out.println("Second Matrix : ");
        printMatrix(N, r2, c2);
        System.out.println();
        System.out.println("Transpose of second matrix : ");
        transpose(N, r2, c2);
        System.out.println();
        System.out.println("Addition of two matrices : ");
        addMatrix(M, r1, c1, N, r2, c2);
        System.out.println();
        System.out.println("Multiplication of two matrice : ");
        multiplyMatrix(M, r1, c1, N, r2, c2);
        System.out.println();

         transposeInPlace(M,r1);
                                 */
        rotateMatrix(M,r1);

    }
}
