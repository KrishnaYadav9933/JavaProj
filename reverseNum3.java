import java.util.*;

public class reverseNum3 {

    public static int ReverseNum(int number) {
        boolean isNoNegative = number < 0 ? true : false;
        if (isNoNegative) {
            number = number * (-1);
        }
        int reverse = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        return isNoNegative == true ? reverse * -1 : reverse;

    }

    public static void main(String[] args) {
        System.out.println("Enter the number which you want to reverse: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int reverseNum = ReverseNum(num);
        System.out.println("The reverse of the entered number : " + reverseNum);
    }
}