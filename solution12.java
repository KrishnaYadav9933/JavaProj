import java.util.*;
public class solution12 {

    static ArrayList<Integer> findSol(int [] arr){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);

            }
            else{
                hm.put(arr[i], 1);
            }
        }
        for(int i=1; i<=n; i++){
            if(!hm.containsKey(i)){
                ans.add(i);
            }
            else if(hm.get(i)==2){
                ans.add(i);
            }
            if(ans.size()==2){
                break;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int [] arr={3,1,2,3,4};
        System.out.println(findSol(arr));

    }
}
