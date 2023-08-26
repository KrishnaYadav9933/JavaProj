import java.util.ArrayList;

public class stringSubseq {
    static ArrayList<String> strSub(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String> smallAns = strSub(s.substring(1));
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;

    }
    static void printStrSubseq(String s, String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printStrSubseq(remString, currAns+curr);
        printStrSubseq(remString, currAns);
    }

    public static void main(String[] args) {
        String str = "abcd";
        String s = "";
//        System.out.println(strSub(str));
        printStrSubseq(str, "");
    }
}
