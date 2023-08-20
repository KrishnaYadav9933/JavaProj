import java.util.Scanner;
class reverseNum {
    public static void main(String[] args){
        System.out.println("Enter the number which ypu want to reverse: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = 0;
        while(num != 0){
            int remainder = (num % 10);
            reverse = reverse*10 + remainder;
            num = num/10;
        }
        System.out.println("The reverse of the entered number is: "+ reverse);
    }
}