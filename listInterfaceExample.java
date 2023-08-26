import java.util.*;
public class listInterfaceExample {
    static void linkedListExample() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1, 10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }
    static void stackExample(){
        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("Skill");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.empty());
    }

    public static void main(String[] args) {
//        linkedListExample();
        stackExample();
    }
}
