public class fibonacciSeries {
    static int fib(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    static int fibMemoized(int n, int [] Arr){
        if(n==0 || n==1) return n;
        if(Arr[n] != 0) return Arr[n];
        Arr[n]=fibMemoized(n-1, Arr)+fibMemoized(n-2, Arr);
        return Arr[n];
    }

    public static void main(String[] args) {
        int n=10;
        int [] A= new int[n+1];
        System.out.println(fibMemoized(n, A));
    }
}
