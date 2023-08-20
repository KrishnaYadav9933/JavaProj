import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of numbers: ");
        int n = scan.nextInt();
        int [] Arr= new int [n];
        System.out.println("Enter "+n+" numbers: ");
        for(int k=0; k<n; k++){
            Arr[k]=scan.nextInt();
        }
        for(int j=1; j<n; j++){
            int key = Arr[j];
            int i =j-1;
            while(i>=0 && Arr[i]>key){
                Arr[i+1]=Arr[i];
                i=i-1;
            }
        Arr[i+1]=key;
        }
        System.out.println("The sorted array is as follows: ");
        for(int k=0; k<n; k++){
            System.out.print(Arr[k]+" ");
        }
        System.out.println(" ");

        System.out.println("Enter the element which you want to search: ");
        int element = scan.nextInt();
        int low=0;
        int high = n-1;
        int mid = (low+high)/2;
        while(Arr[mid] != element && low<=high ){
            if(element<Arr[mid]){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
            mid = (low+high)/2;
        }
        if(Arr[mid]==element){
            System.out.println("element: "+element+" is present at index "+mid);
        }
        else{
            System.out.println("The element: "+element+" is not present in this array");  
        }

    }
}