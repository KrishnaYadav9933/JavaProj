import java.util.Scanner;
public class qQueries {
    static int Queries(int [] Arr, int i, int j){
        int [] prefix = new int[Arr.length];
        prefix[1]=Arr[1];
        for(int p=2; p<prefix.length; p++){
            prefix[p]=prefix[p-1]+Arr[p];
        }
        return (prefix[j]-prefix[i-1]);
    }
    static int totalsum(int [] Arr){
        int sum =0;
        for(int i=1; i<Arr.length; i++){
            sum += Arr[i];
        }
        return sum;
    }
    static boolean equalPartition(int [] Arr){
        int sum = totalsum(Arr);
         int prefix =0;
        for(int i=1; i<Arr.length; i++){
             prefix += Arr[i];
            int suffix = sum-prefix;
            if(prefix == suffix){
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = scan.nextInt();
        int[] nums = new int [n+1];
        System.out.println("Enter the numbers : ");
        for(int i=1; i<n+1; i++){
            nums[i]=scan.nextInt();
        }
        System.out.print(equalPartition(nums));
       /* System.out.println("Enter the numbers of queries : ");
        int q = scan.nextInt();
        while(q>0){
            System.out.println("Enter the range: ");
            int l = scan.nextInt();

            int m= scan.nextInt();
            System.out.println("Sum = "+Queries(nums, l, m));
            q--;
        } */


    }
}
