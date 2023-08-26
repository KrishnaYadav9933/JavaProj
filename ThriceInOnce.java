public class ThriceInOnce {
    static void solution(int [] arr){
        int tn=Integer.MAX_VALUE, tnp1=0, tnp2=0;
        for(int i=0; i<arr.length; i++){
            int cwtn=arr[i]&tn;
            int cwtnp1= arr[i] & tnp1;
            int cwtnp2 = arr[i] & tnp2;

            tn=tn & (~cwtn);
            tnp1=tnp1 | cwtn;

            tnp1=tnp1 & (~cwtnp1);
            tnp2=tnp2 | cwtnp1;

            tnp2=tnp2 & (~cwtnp2);
            tn = tn | cwtnp2;
        }
        System.out.println(tnp1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,-4,1,2,3,1,2,3};
        solution(arr);
    }
}
