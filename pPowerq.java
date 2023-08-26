public class pPowerq {
//    static int power(int p, int q){         //time complexity O(q)
//        if(q==0) return 1;
//        return p*power(p, q-1);
//
//    }
    static int power(int p, int q){      //time complexity O(log q)
        if(q==0) return 1;
        int smallPow = power(p,q/2);
        if(q%2==0) return  smallPow*smallPow;
        return p*smallPow*smallPow;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
