public class removeOcc {
    static String s1="";
    static String remove(String s, char c, int idx){
        if(idx==s.length()) return s1;
        if(s.charAt(idx) != c)
            s1 +=s.charAt(idx);
        return remove(s, c, idx+1);

    }
    static String remove1(String s, char c, int idx){
        if(idx==s.length()) return "";
        if(s.charAt(idx) != c) return s.charAt(idx)+remove1(s, c, idx+1);
        return remove(s, c, idx+1);

    }
    static String remove2(String s, char c){
        if(s.length()==0) return "";
        if(s.charAt(0) != c) return s.charAt(0)+remove2(s.substring(1), c);
        return remove2(s.substring(1), c);
    }

    public static void main(String[] args) {
        String str = "aaaaaaaaaaa";
        //System.out.println(remove(str, 'a', 0 ));
//        System.out.println(remove1(str, 'a', 0 ));
        System.out.println(remove2(str, 'a'));
    }
}
