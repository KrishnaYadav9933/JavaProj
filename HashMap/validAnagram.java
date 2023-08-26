package HashMap;
import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }
            else{
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq+1);
            }
        }
        return mp;
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);
    }

    static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        Map<Character, Integer> charS1 = new HashMap<>();
        Map<Character, Integer> charS2 = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            if(charS1.containsKey(s1.charAt(i))){
                int val = charS1.get(s1.charAt(i));
                charS1.put(s1.charAt(i), val+1);
            }
            else{
                charS1.put(s1.charAt(i), 1);
            }
        }
        for(int i=0; i<s1.length(); i++){
            if(charS2.containsKey(s2.charAt(i))){
                int val = charS2.get(s2.charAt(i));
                charS1.put(s2.charAt(i), val+1);
            }
            else{
                charS2.put(s2.charAt(i), 1);
            }
        }
        for(var e : charS1.keySet()){
            if(charS1.get(e) != charS2.get(e)) {
                return false;
            }
        }
        return true;


    }
    static boolean anagramSecAppr(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i), 1);
            }
            else{
                int currFreq = mp.get(s.charAt(i));
                mp.put(s.charAt(i), currFreq+1);
            }
        }
        for(int i=0; i<t.length(); i++){
            if(mp.containsKey(t.charAt(i))){
                int currFreq = mp.get(t.charAt(i));
                    mp.put(t.charAt(i), currFreq - 1);
                }
            else{
                return false;
            }
        }
       for(Integer i : mp.values()) {
           if (i != 0) return false;
       }
       return true;
    }

    public static void main(String[] args) {
        String s1 ="abcdddaefggh";
        String s2 ="abacdedfdghg";
        System.out.println(anagramSecAppr(s1, s2));
    }
}
