public class sumOfSubset {
    static void subsetSum(int [] arr, int n, int idx, int currSum){
        if(idx>=n){
            System.out.println(currSum);
            return;
        }
        subsetSum(arr, n, idx+1, currSum+arr[idx]);
        subsetSum(arr, n, idx+1, currSum);

    }

    public static void main(String[] args) {
        int [] Arr = {1,2,3,4,5,6};
        subsetSum(Arr, 6, 0, 0);
    }
}
