import java.util.*;
public class arrayList {
    public static void main(String [] args){
        /*Integer i = Integer.valueOf(3);
        System.out.println(i);
        Float f = Float.valueOf(4.5f);
        System.out.println(f); */
        ArrayList<Integer> l1 = new ArrayList<>();
        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //print the arraylist
//        for(int i=0; i<l1.size(); i++){
//            System.out.print(l1.get(i)+" ");
//        }
        //print Arraylist Dirrectly
        System.out.println(l1);
        //add element at any index i
        l1.add(1, 100);
        System.out.println(l1);

        //modify the element at the index i
        l1.set(1, 10);
        System.out.println(l1);

        //remove an element at index i
        l1.remove(1);
        System.out.println(l1);

        //remove an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //if you donot specify class, you can put anything inside Arraylist
        ArrayList l = new ArrayList();
        l.add("pqest");
        l.add(4);
        l.add(4.5f);
        System.out.println(l);


    }
}
