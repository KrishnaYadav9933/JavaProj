public class findLastIdx {
    static int lastIdx(int [] arr, int target, int idx){
        if(idx==-1) return idx;
        if(arr[idx]==target) return idx;
        return lastIdx(arr, target, idx-1);
    }

    public static void main(String[] args) {
        int [] A = {10,2,3,4,4,4,4};
        int target = 6;
        System.out.println(lastIdx(A, target, A.length-1));
    }
}
