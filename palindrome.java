public class palindrome {
    static boolean palDrome(String s, int idx1, int idx2){
        if(idx1>=idx2) return true;
        if(s.charAt(idx1) !=s.charAt(idx2)) return false;
        return palDrome(s, idx1+1, idx2-1);

    }
    public static void main(String[] args) {
        String str = new String("abecdcba");
        String gtr = "ab";
        System.out.println(palDrome(gtr, 0, gtr.length()-1));
//        int i=0; int j= str.length()-1;
//        boolean flag=true;
//        while(i<j){
//           if(str.charAt(i) != str.charAt(j)){
//               flag = false;
//               break;
//           }
//           i++;
//           j--;
//        }
//        if(flag == true){
//            System.out.println("String is palindrome");
//
//        }
//        else{
//            System.out.println("String is not palindrome");
//        }
    }
}
