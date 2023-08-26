package HashMap;
import java.util.HashMap;
//findout largest subArray with sum = 0

public class largestSubarray {
    static int bruteForce(int [] arr){
        int maxLen =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int p =i; p<=j; p++){
                    sum += arr[p];
                }
                if(sum == 0 && (j-i+1)>maxLen)
                    maxLen=j-i+1;
            }
        }
        return maxLen;
    }
    static int optimalAppr(int [] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxLen=0, prefixSum=0;
        hm.put(0, -1);
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];
            if(hm.containsKey(prefixSum)){
                maxLen = Math.max(maxLen, i-hm.get(prefixSum));
            }
            else{
                hm.put(prefixSum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int [] Arr = {1,4,5,6,10,20,30,-10,-20,-30};
        System.out.println(optimalAppr(Arr));
    }
}
