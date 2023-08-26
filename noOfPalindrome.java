import java.util.Scanner;
public class noOfPalindrome {
    static int checkPalindrome(String str){
        int i=0, j=str.length()-1;
        int value=1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                value =0;
                break;
            }
            i++;
            j--;
        }
        return value;

    }
    static int countPalindrome(String str){
        int count =0;
        for(int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                String gtr = str.substring(i,j);
                count +=checkPalindrome(gtr);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcdcba";
        int c = countPalindrome(s);
        System.out.println("No of palindrome = "+c);

    }
}
