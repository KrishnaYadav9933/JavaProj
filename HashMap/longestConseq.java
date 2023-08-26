package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class longestConseq {
//    static int longestLength(int [] arr){
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            hm.putIfAbsent(arr[i], 0);
//        }
//        int maxLength=0;
//        for(Integer i : hm.keySet()){
//            if(hm.get(i)==1) continue;
//            int count =1;
//            int curr = i;
//            hm.put(i, 1);
//            i=i+1;
//            while(hm.containsKey(i)){
//                if(hm.get(i) != 1){
//                    count++;
//                    hm.put(i, 1);
//                    i++;
//                }
//            }
//            curr=curr-1;
//            while(hm.containsKey(curr)){
//                if(hm.get(curr) != 1){
//                    count++;
//                    hm.put(curr, 1);
//                    curr--;
//                }
//            }
//            if(count>maxLength)
//                maxLength=count;
//        }
//        return maxLength;
//    }
    static int longestLength2(int [] arr){
        HashSet<Integer> hs = new HashSet<>();
        int maxLength =0;
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        for(Integer i : hs){
            if(!hs.contains(i-1)){
                int count =1;
                int p=i;
                p++;
                while(hs.contains((p))){
                    count++;
                    p++;
                }
                if(count>maxLength)
                    maxLength = count;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int [] Arr = {1, 100,2,4,6,101,78,102, 103,104, 105, 106,107,23, 3,5};
        System.out.println(longestLength2(Arr));
    }
}
