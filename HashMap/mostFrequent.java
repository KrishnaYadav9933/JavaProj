package HashMap;
import java.util.*;

public class mostFrequent {
    public static void main(String[] args) {
        int [] Arr ={1,3,2,1,4,1};
        Scanner scan = new Scanner(System.in);
        Map<Integer, Integer> mp = new HashMap<>();
//        for(int i=0; i<Arr.length; i++){
//            if(mp.containsKey(Arr[i])){
//                mp.put(Arr[i], mp.get(Arr[i]+1));
//            }
//            else{
//                mp.put(Arr[i], 1);
//            }
//        }
        for(int el : Arr){
            if(!mp.containsKey(el)){
                mp.put(el, 1);
            }
            else{
                mp.put(el, mp.get(el)+1);
            }
        }
//        System.out.println("Frequency Map");
//        System.out.println(mp.entrySet());
        int maxFreq=0, ansKey=-1;
//        for(var e : mp.entrySet()){
//            if(e.getValue()>maxFreq){
//                maxFreq= e.getValue();
//                ansKey= e.getKey();
//            }
//        }
        for(var key : mp.keySet()){
            if(mp.get(key)>maxFreq){
                maxFreq = mp.get(key);
                ansKey=key;
            }
        }
        System.out.println(ansKey);


    }
}
