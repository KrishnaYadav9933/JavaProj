package stack;

public class stackImplementation {
    static class stack{
        int [] arr = new int [5];
        int n = arr.length;
        static int idx=-1;
        void push(int elt){
            if((idx+1)>=n) {
                System.out.println("Overflow");
                return;
            }
            arr[idx+1]=elt;
            idx++;
        }
        int peek(){
            if(idx==-1){
                System.out.println("underflow");
                return -1;
            }
            return arr[idx];
        }
        int pop(){
            if(idx==-1){
                System.out.println("Underflow");
                return -1;
            }
            int x= arr[idx];
            idx--;
            return x;
        }
        void display(){
            for(int i=0; i<=idx; i++){
                System.out.print(arr[i]+" ");
            }
        }
        boolean isEmpty(){
            if(idx==-1) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==n-1) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        System.out.println();
        System.out.println(st.peek());
//        System.out.println(st.pop());
        st.display();
        System.out.println();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
