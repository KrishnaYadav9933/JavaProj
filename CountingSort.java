import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of elements which you want to sort: ");
        int n = scan.nextInt();
        int[] A = new int[n];
        System.out.println("Enter highest value of your numbers: ");
        int k = scan.nextInt();
        int[] C = new int[k + 1];
        int[] B = new int[n + 1];
        System.out.println("Enter " + n + " no of elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < k + 1; i++) {
            C[i] = 0;
        }
        for (int j = 0; j < n; j++) {
            C[A[j]] = C[A[j]] + 1;
        }
        for (int i = 1; i < k + 1; i++) {
            C[i] = C[i] + C[i - 1];
        }
        for (int j = n - 1; j >= 0; j--) {
            B[C[A[j]]] = A[j];
            C[A[j]] = C[A[j]] - 1;
        }
        System.out.println("The Sorted list is as follows: ");
        for (int i =1;i <=n; i++) {
            System.out.print(B[i]+" ");
        }
    }
}