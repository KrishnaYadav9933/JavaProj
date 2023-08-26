import java.util.ArrayList;

public class multiplyString {
    static ArrayList<String> multiply(String num1, String num2){
        ArrayList<String> ans = new ArrayList<>();
        int m = num1.length();
        int n = num2.length();
        for(int i=m-1; i>=0; i--){
            StringBuilder s = new StringBuilder();
            int a =num1.charAt(i)-'0';
            int carry=0;
            for(int j=n-1; j>=0; j--){
               int b =num2.charAt(j)-'0';
               int res=a*b+carry;
               int ud=res%10;
               s.insert(0, ud);
               carry=res/10;
            }
            if(carry != 0){
            s.insert(0, carry);}
            int back = (m-1-i);
            while(back>0){
                s.append(0);
                back--;
            }
            ans.add(String.valueOf(s));
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 ="234";
        String s2 ="123";
        System.out.println(multiply(s1, s2));
    }
}
