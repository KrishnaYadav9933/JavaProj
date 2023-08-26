package stack;

import java.util.Stack;

public class printStack {
    static void displayRev(Stack<Integer> st){
        if(st.size()==0) return;
        int x = st.pop();
        System.out.print(x+" ");
        displayRev(st);
        st.push(x);
    }
    static void remove(Stack<Integer> st, int idx, int n){
       if(idx<0 || idx>n-1) return;
       if(idx+1==st.size()){
            st.pop();
            return;
        }
        int x = st.pop();
        remove(st, idx, n);
        st.push(x);

    }
    static void display(Stack<Integer> st){
        if(st.size()==0) return;
        int x = st.pop();
        display(st);
        System.out.print(x+" ");
        st.push(x);
    }
    static void insertAtBottom(Stack<Integer> st, int elt){
        if(st.size()==0){
            st.push(elt);
            return;
        }
        int x=st.pop();
        insertAtBottom(st, elt);
        st.push(x);
    }
    static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int x = st.pop();
        reverse(st);
        insertAtBottom(st, x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
//        int [] arr = new int[st.size()];
//        for(int i=arr.length-1; i>=0; i--){
//            arr[i]=st.pop();
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }
          display(st);
        System.out.println();
        reverse(st);
        display(st);
//          insertAtBottom(st, 0);
//          display(st);
//        System.out.println();
//        remove(st, 10, 5);
//        display(st);
//        System.out.println(st);
    }
}
