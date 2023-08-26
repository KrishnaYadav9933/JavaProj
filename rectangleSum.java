import java.util.Scanner;
public class rectangleSum {
    static int rectSum(int [][] M, int r1, int c1, int r2, int c2, int r, int c){
        int sum =0;
        if(r1<0 || r1>r-1 || c1<0 || c1>c-1 || r2<0 || r2>r-1 || c2<0 || c2>c-1){
            System.out.println("Invalid Input !");
            return -1;
        }
        if(r1<=r2) {
            if(c1<=c2) {
                for (int i = r1; i <= r2; i++) {
                    for (int j = c1; j <= c2; j++) {
                        sum += M[i][j];
                    }
                }
            }
            else{
                for (int i = r1; i <= r2; i++) {
                    for (int j = c2; j <= c1; j++) {
                        sum += M[i][j];
                    }
                }
            }
        }
        else{
            if(c1<=c2) {
                for (int i = r2; i <= r1; i++) {
                    for (int j = c1; j <= c2; j++) {
                        sum += M[i][j];
                    }
                }
            }
            else{
                for (int i = r2; i <= r1; i++) {
                    for (int j = c2; j <= c1; j++) {
                        sum += M[i][j];
                    }
                }
            }
        }
        return sum;




    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the order of Matrix: ");
        int r= scan.nextInt();
        int c = scan.nextInt();
        System.out.println("Enter the location of first cell: ");
        int r1= scan.nextInt();
        int c1 = scan.nextInt();
        System.out.println("Enter the location of last cell: ");
        int r2= scan.nextInt();
        int c2 = scan.nextInt();
        System.out.println("Enter the value of " + r * c + " numbers: ");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println(rectSum(matrix, r1, c1, r2, c2, r, c));


    }
}

