import java.util.Scanner;
public class addTwoNumbers {
    public static StringBuilder add(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        n1--;
        n2--;
        int carry=0;
        StringBuilder temp = new StringBuilder();
        while(n1>=0 && n2>=0){
            int num1=s1.charAt(n1--)-'0';
            int num2=s2.charAt(n2--)-'0';
            int sum = num1+num2+carry;
            int rem = sum%10;
            carry=sum/10;
            temp.insert(0, rem);
        }
        while(n1>=0){
            int num1 = s1.charAt(n1--)-'0';
            int sum = num1+carry;
            int rem = sum%10;
            carry = sum/10;
            temp.insert(0,rem);
        }
        while(n2>=0){
            int num2 = s2.charAt(n2--)-'0';
            int sum = num2+carry;
            int rem = sum%10;
            carry = sum/10;
            temp.insert(0,rem);
        }
        if(carry != 0){
            temp.insert(0, carry);
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstStr;
        String seconStr;
        System.out.println("Enter First Number : ");
        firstStr=scan.next();
        System.out.println("Enter the second number : ");
        seconStr=scan.next();
        StringBuilder ans = add(firstStr, seconStr);
        System.out.println("The sum of the above two Entered Numbers = "+ans);
    }
}
