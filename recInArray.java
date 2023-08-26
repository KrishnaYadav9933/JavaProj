public class recInArray {
    static int ArraySum(int [] arr, int idx){
        if(idx==arr.length-1) return arr[idx];
        return ArraySum(arr, idx+1)+arr[idx];
    }

    public static void main(String[] args) {
        int [] Arr={10,20,30,40};
        System.out.println(ArraySum(Arr, 0));
    }
}
