import java.util.*;
public class prefixSum {
   static void makePrefixSum(int [] Arr){
       int [] prefix = new int [Arr.length];
       prefix[0]=Arr[0];
       for(int i=1; i<Arr.length; i++){
           prefix[i] = prefix[i-1]+Arr[i];
       }
       printArray(prefix);
    }
    static void makeSuffixSum(int [] Arr){
       int [] suffix = new int [Arr.length];
        int n=Arr.length-1;
       suffix[n]=Arr[n];
       for(n=n-1; n>=0; n--){
           suffix[n] = suffix[n+1]+Arr[n];
       }
       printArray(suffix);
    }



    static void printArray(int [] Arr){
        for(int i=0; i<Arr.length; i++){
            System.out.print(Arr[i]+" ");
        }

    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = scan.nextInt();
        int [] nums = new int [n];
        System.out.println("Enter the numbers : ");
        for(int i=0; i<nums.length; i++){
            nums[i] = scan.nextInt();
        }
        printArray(nums);
        System.out.println();
        makePrefixSum(nums);
        System.out.println();
        makeSuffixSum(nums);


    }
}
