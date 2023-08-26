public class subString {
    public static void main(String[] args) {
        String str = "acjkobcd";
        char ch = 'z';
        str += Character.toString(ch);
        int m =str.length();

        //System.out.println(str);
     System.out.println(str.substring(m, m));
//        System.out.println(str.substring(3));
//
//        for(int i=0; i<str.length(); i++){
//            for(int j=i+1; j<=str.length(); j++){
//                System.out.println(str.substring(i,j)+" ");
//            }
//            System.out.println();

        }
    }

