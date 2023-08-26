public class maxDistBetStartPoint {
    static boolean isPossible(int [] a, int k, int dist){
    int kidPlac=1;
    int lastKid=a[0];
    for(int i=1; i<a.length; i++){
        if((a[i]-lastKid)>=dist){
            kidPlac++;
            lastKid=a[i];
        }
    }
        return kidPlac>=k;
    }
    static int maxPossDist(int [] a, int m){
        if(m>a.length) return -1;
        int st=0, end=(int)1e9;
        int ans=-1;
        while(st<=end){
            int mid = st +(end-st)/2;
            if(isPossible(a, m, mid)){
                ans=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] a={1,2,4,8,9};
        int m = 3;
        System.out.println(maxPossDist(a, m));

    }
}
