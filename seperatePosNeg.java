public class seperatePosNeg {
    static void arrange(int [] arr, int i , int temp){
        int t = arr[i];
        for(int j =i-1; j>=temp; j--){
            arr[j+1]=arr[j];
        }
        arr[temp]=t;
    }
    public static void main(String[] args) {
        int [] arr = {-10,2,3,-8,5,6,-4,2,0,1,-1, 7,-7,-10, 5,2};
        int n = arr.length;
        int temp =0;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                arrange(arr, i, temp);
                temp++;
            }
        }
        for(int i : arr) System.out.print(i+" ");
    }
}
