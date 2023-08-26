import java.util.*;
class problem0 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> q = new ArrayList<>(1);
        q.add(0,1);
        ans.add(q);
        for(int i=1; i<numRows; i++){
            List<Integer> l = new ArrayList<>();
            l.add(0,1);
            l.add(i, 1);
            for(int j=1; j<i; j++){
                l.add(j, ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
            ans.add(l);
            l.clear();
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }
}
