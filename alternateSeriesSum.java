public class alternateSeriesSum {
    static int altSum(int n){
        if(n==0) return 0;
        if(n%2 == 0) return altSum(n-1)-n;
        return altSum(n-1)+n;
    }

    public static void main(String[] args) {
        int n =10;
        System.out.println(altSum(n));
    }
}
