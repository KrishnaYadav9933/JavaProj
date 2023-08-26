package stack;

import java.util.Stack;

public class basicOfStack {



        public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(10);
            st.push(11);
            st.push(12);
            st.push(5);
            st.push(34);
            System.out.println(st.peek());
            st.pop();
            System.out.println(st.peek());
            System.out.println(st);

        }
    }
