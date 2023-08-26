import java.util.ArrayList;

public class greyCode {
    static ArrayList<String> GreyCode(int n){
        if(n==1){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;
        }
        ArrayList<String> rres= new ArrayList<>();
        rres=GreyCode(n-1);
        ArrayList<String> mres= new ArrayList<>();
        for(String s : rres){
            s = 0+s;
            mres.add(s);
        }
        for(int i=rres.size()-1; i>=0; i--){
            String s = 1+rres.get(i);
            mres.add(s);
        }
        return mres;
    }

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<String> result = GreyCode(n);
        for(String s : result){
            int a = Integer.parseInt(s, 2);
            ans.add(a);

        }
        System.out.println(ans);

    }
}
