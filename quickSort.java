public class quickSort {
    static void display(int [] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void swap(int [] arr, int x, int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int [] arr, int st, int end){
        int pivot = arr[st];
        int count=0;
        for(int i = st+1; i<=end; i++){
            if(arr[i]<=pivot) count++;
        }
        int pivotIdx=st+count;
        swap(arr, st, pivotIdx);
        int i=st, j=end;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<pivotIdx && j>pivotIdx){
                swap(arr, i, j);
            }
        }
        return pivotIdx;
    }
    static void quicksort(int [] arr, int st, int end){
    if(st>=end) return;
    int pi = partition(arr, st, end);
    quicksort(arr, st, pi-1);
    quicksort(arr, pi+1, end);
    }

    public static void main(String[] args) {
        int [] Arr={2,5,1,4,3,5,6,6,7,8,88};
        System.out.println("Array before sorting");
        display(Arr);
        int n = Arr.length;
        quicksort(Arr, 0, n-1);
        System.out.println("Array after sorting");
        display(Arr);

    }
}
