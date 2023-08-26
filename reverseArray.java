import java.util.*;
public class reverseArray {
    static void reverseList(ArrayList<Integer> list){
        int i=0, j=list.size()-1;
        while(i<j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        System.out.println("Original list : "+list);
        //reverseList(list);
        Collections.reverse(list);
        System.out.println("Reverse list : "+list);

        Collections.sort(list);
        System.out.println("Ascending order : "+list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Decending order : "+list);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Welcome");
        l2.add("To");
        l2.add("India");
        System.out.println("Original String "+l2);
        Collections.sort(l2);
        System.out.println("Sorted string "+l2);


    }
}
