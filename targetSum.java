import java.util.HashMap;
import java.util.Arrays;

public class targetSum {
    static int [] pairOfIdx(int [] arr, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int [] ans = new int[2];
        for(int i=0; i<arr.length; i++){
            int partner = target-arr[i];
            if(hm.containsKey(partner)){
                ans[0]=i;
                ans[1]=hm.get(partner);
                return ans;
            }
            hm.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] Arr = {1,10,5,28,34,2,3,4,5};
        System.out.println(Arrays.toString(pairOfIdx(Arr, 10)));
    }
}
