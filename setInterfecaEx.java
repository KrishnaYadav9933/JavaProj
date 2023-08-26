import java.util.*;
public class setInterfecaEx {
    static void hashSet(){
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(12);
        st.add(9);
        st.add(48);
        st.add(50);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(51);
        System.out.println(st.contains(2));
        System.out.println(st);
    }
    static void treeSet(){
        TreeSet<Integer> st = new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(12);
        st.add(9);
        st.add(48);
        st.add(50);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(51);
        System.out.println(st.contains(2));
        System.out.println(st);
    }
    public static void main(String[] args) {
//        LinkedHashSet<Integer> st = new LinkedHashSet<>();
//        st.add(1);
//        st.add(2);
//        st.add(3);
//        st.add(12);
//        st.add(9);
//        st.add(48);
//        st.add(50);
//        System.out.println(st);
//        st.add(1);
//        st.add(1);
//        st.add(2);
//        System.out.println(st);
//        st.remove(51);
//        System.out.println(st.contains(2));
//        System.out.println(st);
        treeSet();
    }
}
