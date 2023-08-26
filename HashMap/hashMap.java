package HashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        //syntax
        Map<String, Integer> mp = new HashMap<>();
        //adding elements
        mp.put("Krishna", 21);
        mp.put("Yash", 20);
        mp.put("Sumit", 19);
        mp.put("Rohit", 23);
        mp.put("Rahul", 22);
//        HashSet<Integer> hs = new HashSet<>();
//        hs.add(1);
//        hs.add(2);

//        System.out.println(mp.get("Krishna"));
//        System.out.println(mp.get("Ronit"));
        mp.put("Krishna", 22);
//        System.out.println(mp.get("Krishna"));
        System.out.println(mp.remove("Krishna"));
        System.out.println(mp.remove("Riya"));
        //checking if a key is exist or not
        System.out.println(mp.containsKey("Sumit"));
        System.out.println(mp.containsKey("Piya"));
        //Adding a new Array only if the new key doesn't exist
        mp.putIfAbsent("Krishna", 22);//will enter
        mp.putIfAbsent("Rahul", 30); //will not enter
        //getting all the keys in the HashMap
        System.out.println(mp.keySet());
        //get all the value in HashMap
        System.out.println(mp.values());
        //get all the entries in the hashMap
        System.out.println(mp.entrySet());
        //traversing all the entries of HashMap
        int a = mp.size();
        System.out.println("The size of HashMap is "+a);
        for(String pey : mp.keySet()){
            System.out.printf("Age of %s is %d\n", pey, mp.get(pey));
        }
        System.out.println();
        //traversing on entryset
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }



    }
}
