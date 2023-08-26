public class kMultiple {
    static void multiple(int num, int k) {
        if (k == 0) return;
        multiple(num, k-1);
        System.out.print(num*k+" ");

    }

    public static void main(String[] args) {
        int n=12;
        int k =8;
        multiple(n,k);
    }
}
