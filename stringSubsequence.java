//import java.util.ArrayList;
//
//public class stringSubsequence {
//    static ArrayList<String> Finalans = new ArrayList<>();
//    static void subSeq(String s, String ans){
//        if(s.length()==0){
//            Finalans.add(ans);
//            return;
//        }
//        subSeq(s.substring(1), ans+s.charAt(0));
//        subSeq(s.substring(1), ans);
//    }
//
//    public static void main(String[] args) {
//        subSeq("abc", "");
//        System.out.println(Finalans);
//    }
//}

// Java Program to print all subsequence of a
// given string.
import java.util.HashSet;

public class stringSubsequence {

    // Set to store all the subsequences
    static HashSet<String> st = new HashSet<>();

    // Function computes all the subsequence of an string
    static void subsequence(String str)
    {

        // Iterate over the entire string
        for (int i = 0; i < str.length(); i++) {

            // Iterate from the end of the string
            // to generate substrings
            for (int j = str.length(); j > i; j--) {
                String sub_str = str.substring(i, j);

                if (!st.contains(sub_str))
                    st.add(sub_str);

                // Drop kth character in the substring
                // and if its not in the set then recur
                for (int k = 1; k < sub_str.length() - 1;
                     k++) {
                    StringBuffer sb
                            = new StringBuffer(sub_str);

                    // Drop character from the string
                    sb.deleteCharAt(k);
                    if (!st.contains(sb))
                        ;
                    subsequence(sb.toString());
                }
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "aabc";
        subsequence(s);
        System.out.println(st);
    }
}

