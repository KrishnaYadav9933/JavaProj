public class reverse {
    static int reverse1(int x) {
        if (x == 0) return 0;
        boolean flag = true;
        if (x < 0) flag = false;
        x = Math.abs(x);
        int revNum = 0;
        while (x > 0) {
            int rem = x % 10;
            revNum = revNum * 10 + rem;
            x = x / 10;
        }
        if (flag) {
            return revNum;
        } else {
            return -revNum;
        }
    }

    public static void main(String[] args) {
        int n = 120;
        System.out.println(reverse1(n));
        String num = "010101010";

//       int sum = String

    }
}
