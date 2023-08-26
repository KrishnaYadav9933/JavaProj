public class climbingStairs {
    static int countPath(int n, int [] Arr){
        if(n==0) return 1;
        if(n<0) return 0;
        if(Arr[n] != 0) return Arr[n];
        int p1= countPath(n-1, Arr);
        int p2 = countPath(n-2, Arr);
        int p3 = countPath(n-3, Arr);
        Arr[n]= p1+p2+p3;
        return Arr[n];

    }
    static int countPathTab(int n){
        int [] dp= new int [n+1];
        dp[0]=1;
        for(int i=1; i<=n; i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }
            else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n= 10;
        int [] arr= new int[n+1];
        System.out.println(countPathTab(n));
    }
}
