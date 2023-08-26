public class DistributeChoclate {
    static boolean isDivisionPossible(int [] a, int m, int mid){
        int n=a.length;
        int point=0;    //pointer for pointing index of array
        int nos=1;   //no Of Student
        int cc=0;    //Choclate count
        while(point<n){
           if(a[point]>mid) return false;
           if(cc+a[point]<=mid){
               cc +=a[point];
           }
           else{
               nos++;
               cc=a[point];
           }
           point++;
        }
        if(nos>m) return false;
        return true;
    }
    static int distributeChoclate(int [] a, int m){
        if(a.length<m) return -1;
        int ans=0, st=1, end=(int)1e9;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(isDivisionPossible(a, m, mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] a = {12, 34, 67, 90};
        int m=2;
        System.out.println(distributeChoclate(a,m));
    }
}
