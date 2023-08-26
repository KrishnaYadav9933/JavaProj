import java.util.ArrayList;
import java.util.List;

public class permutation {
    static ArrayList<ArrayList<Integer>> permute(int [] nums, int k){
        if(k==0){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(nums[k]);
            ArrayList<ArrayList<Integer>> bc=new ArrayList<>();
            bc.add(temp);
            return bc;
        }
        ArrayList<ArrayList<Integer>> rc= permute(nums, k-1);
        ArrayList<ArrayList<Integer>> mc = new ArrayList<>();
        int elt=nums[k];

        for(int i=0; i< rc.size(); i++){
            ArrayList<Integer> temp = rc.get(i);
            for(int j=0; j<= temp.size(); j++){
               ArrayList<Integer> temp1=temp;
               temp1.add(j, elt);
               mc.add(temp1);
            }
        }
        return mc;
    }

    public static void main(String[] args) {
        int [] arr={1,2};
        int n= arr.length-1;
        System.out.println(permute(arr, n));
    }
}
