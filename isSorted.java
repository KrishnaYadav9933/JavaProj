public class isSorted {
    static boolean checkSorted(int [] arr, int idx, int n){
        if(idx==n) return true;
        if(arr[idx]<arr[idx-1]) return false;
        return checkSorted(arr, idx+1, n);
    }

    public static void main(String[] args) {
        int [] A ={1,2,3,5,9,27,25};
        int n = A.length;
        System.out.println(checkSorted(A, 1, n));
    }
}
