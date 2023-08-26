public class factorial {
    static int fact(int n){
        if(n == 1){
            return 1;
        }
       return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        //int fact5 = fact(5);
        System.out.println(fact(5));
    }
}
