public class gcd {
    static int bruteForce(int a, int b){
        if(a==b) return a;
        int min =a;
        if(a>b){
            min =b;
        }
        while(a%min !=0 || b%min !=0) {
            min--;
        }
        return min;

    }
    static int recursive (int x, int y){ //Euclid Algorithm
        if(x==y || y==0) return x;      //gcd(x,y)=gcd(y,x%y)
        if(y>x) return  recursive(y,x); //gcd(x,0) return x    - BaseCase
        return recursive(y,x%y);
    }
    static int iterative(int x, int y){
        if(x==y || y==0) return x;
        if(y>x){
            if(x==0) return y;
            int temp =x;
            x=y;
            y=temp;
        }
        while(x%y != 0){
            int rem =y;
            y=x%y;
            x=rem;
        }
        return y;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 16;
       // System.out.println(bruteForce(12, 16));
        //System.out.println(recursive(a,b));
        System.out.println(iterative(a,b));
    }
}
