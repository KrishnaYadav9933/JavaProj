import java.util.*;
public class letterCombination {
        static String digitString(char ch){
            switch(ch){
                case '2':
                    return "abc";
                case '3':
                    return "def";
                case '4':
                    return "ghi";
                case '5':
                    return "jkl";
                case '6':
                    return "mno";
                case '7':
                    return "pqrs";
                case '8':
                    return "tuv";
                case '9':
                    return "wxyz";
            }
            return "";
        }
        static ArrayList<String> letterCombinations(String digits) {
            int n = digits.length();
            if(n==0) return new ArrayList<>();
            ArrayList<String> ans = new ArrayList<>();
            switch(n){
                case 1:
                    String s1=digitString(digits.charAt(0));
                    for(int i=0; i<s1.length(); i++){
                        ans.add(Character.toString(s1.charAt(i)));
                    }
                    break;
                case 2 :
                    String s2 = digitString(digits.charAt(0));
                    String s3 = digitString(digits.charAt(1));
                    for(int i=0; i<s2.length(); i++){
                        for(int j=0; j<s3.length(); j++){
                            String temp ="";
                            temp +=s2.charAt(i);
                            temp +=s3.charAt(j);
                            ans.add(temp);
                        }
                    }
                    break;
                case 3 :
                    String s4 = digitString(digits.charAt(0));
                    String s5 = digitString(digits.charAt(1));
                    String s6 = digitString(digits.charAt(2));
                    for(int i=0; i<s4.length(); i++){
                        for(int j=0; j<s5.length(); j++){
                            for(int k=0; k<s6.length(); k++){
                                String temp ="";
                                temp +=s4.charAt(i);
                                temp +=s5.charAt(j);
                                temp +=s6.charAt(k);
                                ans.add(temp);
                            }
                        }
                    }
                    break;
                case 4:
                    String s7 = digitString(digits.charAt(0));
                    String s8 = digitString(digits.charAt(1));
                    String s9 = digitString(digits.charAt(2));
                    String s0 = digitString(digits.charAt(3));
                    for(int i=0; i<s7.length(); i++){
                        for(int j=0; j<s8.length(); j++){
                            for(int k=0; k<s9.length(); k++){
                                for(int p=0; p<s0.length(); p++){
                                    String temp ="";
                                    temp +=s7.charAt(i);
                                    temp +=s8.charAt(j);
                                    temp +=s9.charAt(k);
                                    temp +=s0.charAt(p);
                                    ans.add(temp);

                                }
                            }
                        }
                    }

            }
            return ans;
        }

    public static void main(String[] args) {
        String str ="";
        System.out.println(letterCombinations(str));
    }
    }

