//public class capitalizeStr {
//    static String capitalizeTitle(String title) {
//        title = title.toLowerCase();
//        int n = title.length();
//        StringBuilder ans = new StringBuilder("");
//        int ls = -1;
//        for (int i = 0; i < n; i++) {
//            if (title.charAt(i) == ' ' || i == n - 1) {
//                if ((i - ls - 1) > 2) {
//                    ans.append(Character.toUpperCase(title.charAt(ls + 1)));
//                    ans.append(title.substring(ls + 2, i + 1));
//                    ls = i;
//                } else {
//                    ans.append(title.substring(ls + 1, i + 1));
//                    ls = i;
//                }
//
//            }
//        }
//            return ans.toString();
//
//    }
//
//        public static void main (String[]args){
//            String s = "capiTALize the tiTLe";
//            System.out.println(capitalizeTitle(s));
//
//        }
//
//    }
class capitalizeStr {
    static boolean isAllUpperCase(String s){
        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))) return false;
        }
        return true;
    }
    static boolean isAllLowerCase(String s){
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))) return false;
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        boolean flag = Character.isUpperCase(word.charAt(0));
        String s = word.substring(1);
            if(isAllUpperCase(word)) return true;
            if(isAllLowerCase(word.substring(1))) return true;
            return false;
    }

    public static void main(String[] args) {
        capitalizeStr cp = new capitalizeStr();
        String s = "Abcd";
        System.out.println(cp.detectCapitalUse(s));
    }
}

