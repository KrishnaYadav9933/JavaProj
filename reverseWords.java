public class reverseWords {
    static String reverse(String s, int idx){
        if(idx == s.length()) return "";
        return reverse(s, idx+1)+s.charAt(idx);
    }
    static String reverse2(String s){
        if(s.length()==0) return "";
        return reverse2(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        String str = "abcdefgh pqrstyu";
        System.out.println(reverse2(str));
//        String ans ="";
//        StringBuilder sb = new StringBuilder("");
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            if(ch != ' '){
//                sb.append(ch);
//            }
//            else{
//                sb.reverse();
//                ans +=sb;
//                ans +=" ";
//                sb.delete(0, sb.length());
//            }
//        }
//        sb.reverse();
//        ans +=sb;
//        System.out.println(ans);
    }
}
