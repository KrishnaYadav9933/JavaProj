import java.util.*;
public class MapInterfaceEx {
    public static void main(String[] args) {


        Map<Integer, String> mp = new HashMap<>();
        mp.put(3, "Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("Rohan"));
    }
}
