public class searchInRotatedSortedArray {
    static int findIndex(int [] arr){
        int n = arr.length;
        int i=0, j=n-1;
        int ans =-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]>arr[n-1]){
                i=mid+1;
            }
            else if(arr[mid]<=arr[n-1]){
                ans = mid;
                j=mid-1;
            }
        }
        return ans;
    }
    static int findTarget(int [] arr, int target){
        int n = arr.length;
        int st=0, end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]==arr[st] && arr[mid]==arr[end]){
                st++;
                end--;
            }
            else if(arr[mid]<=arr[end]){
                if(target>arr[mid] && target<=arr[end]){
                    st=mid+1;
                }
                else{
                    end= mid-1;
                }
            }
            else{
                if(target>=arr[st] && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        int [] Arr={0,0,0,1,1,1,2,0,0,0};
        System.out.println(findTarget(Arr, 2));
    }
}
