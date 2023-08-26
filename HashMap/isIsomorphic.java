package HashMap;

import java.util.HashMap;

public class isIsomorphic {
    static boolean checkIsomorphic(String s, String t){
    HashMap<Character, Character> mp = new HashMap<>();
    for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(!mp.containsKey(ch)){
            for(Character c : mp.values()){
                if(c==t.charAt(i)) return false;
            }
            mp.put(ch, t.charAt(i));
        }
        else{
            if(mp.get(ch) != t.charAt(i)) return false;
        }
    }
    return  true;
    }

    public static void main(String[] args) {
        String s1 = "ababcdef";
        String s2 = "xypyzqmn";
        System.out.println(checkIsomorphic(s1, s2));
    }
}
