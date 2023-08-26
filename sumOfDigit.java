public class sumOfDigit {
//   static int ans =0;
    static int sum(int num){
        if(num==0){
            return 0;
       }
        int digit = num%10;
//        ans += digit;
          num = num/10;
       return sum(num)+digit;

    }

    public static void main(String[] args) {
        int n= 5;
        System.out.println(sum(n));
    }
}
