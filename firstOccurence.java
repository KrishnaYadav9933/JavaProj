public class firstOccurence {
    static int firstIdx(int [] arr, int target){
        int n =arr.length;
        int ans = -1;
        int i=0, j=n-1;
        while(i<=j){
            int mid =i+(j-i)/2;
            if(arr[mid]==target){
                ans = mid;
                i=mid+1;
            }
            else if(arr[mid]>target) {
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] Arr= {1,1,1,2,2,4,5,5,5,6,6};
        System.out.println(firstIdx(Arr, 5));
    }
}
