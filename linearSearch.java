import java.util.Scanner;
public class linearSearch{
    public static void main(String[] args){
        System.out.println("Enter the number of element: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int Arr[]= new int[n];
        System.out.println("Enter "+n+" no of elements: ");
        for(int i=0; i<n; i++){
            Arr[i]=scan.nextInt();
        }
        System.out.println("Enter the element which you want to search: ");
        int key= scan.nextInt();
        int flag=0;
        for(int i=0; i<n; i++){
            if(Arr[i]== key){
                System.out.println("The Element is present at index "+i);
                flag++;
            }
        }
        if(flag==0){
            System.out.println("The element is not present in array");
        }
        }
}