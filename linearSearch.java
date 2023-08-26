import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class linearSearch {
    static int check(int [] arr, int idx, int target){
        if(idx==arr.length) return -1;
        if(arr[idx]==target) return idx;
        return check(arr, idx+1, target);
    }
    static boolean findIndex(int [] arr, int idx, int target){
        if(idx==arr.length) return false;
        if(arr[idx]==target) return true;
        return findIndex(arr, idx+1, target);
    }
//     static ArrayList<Integer> ans = new ArrayList<>();
//
//    static ArrayList<Integer> allIndex(int [] arr, int target, int idx){
//        int n =arr.length;
//        if(idx == n) return ans;
//        if(arr[idx]==target)
//            ans.add(idx);
//        return allIndex(arr, target, idx+1);
//    }
    static ArrayList<Integer> findAllIdx(int [] arr, int target, int idx){
        if(idx==arr.length) return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx]==target)
            ans.add(idx);
        ArrayList<Integer> smallAns= new ArrayList<>();
        smallAns=findAllIdx(arr, target, idx+1);

        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int [] Arr = {10,40,40,20,30,40};
        int target=40;

        System.out.println(findAllIdx(Arr, target, 0));
        }
        }
