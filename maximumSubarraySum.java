public class maximumSubarraySum {
   static int startIdx=-1;
    static int endIdx=-1;
    static int  maxSum(int [] arr){
        int n = arr.length;
         int sum = 0, maxi=Integer.MIN_VALUE;
         int start= -1;
         for(int i=0; i<n; i++){
             if(sum==0) start =i;
            sum +=arr[i];

            if(sum>maxi){
                maxi = sum;
               startIdx=start;
               endIdx=i;
            }
            if(sum<0){
                sum=0;
            }
         }
         return maxi;
    }
    public static void main(String[] args) {
        int [] arr = {-3,-1,2,4,-5,6,-7,88,-8};
        System.out.println(maxSum(arr)+" "+startIdx+" "+endIdx);

    }
}
