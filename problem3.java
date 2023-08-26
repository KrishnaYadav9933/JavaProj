import java.util.*;
public class problem3 {
    static ArrayList<Integer> method2(int [] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n= arr.length;
        int is1=(n*(n+1))/2;
        int is2=(n*(n+1)*(2*n+1))/6;
        int rs1=0;
        int rs2=0;
        for(int i=0; i<n; i++){
            rs1 +=arr[i];
            rs2 +=  arr[i]*arr[i];
        }
        int AminusB=is1-rs1;
        int AplusB=(is2-rs2)/AminusB;
        ans.add((AplusB+AminusB)/2);
        ans.add((AplusB-AminusB)/2);
        return ans;
    }

    public static void main(String[] args) {
        int [] Arr= {3,1,2,3,5};
      System.out.println(method2(Arr));



    }
}






