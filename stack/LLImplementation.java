package stack;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class LLImplementation {
    static class stack{
        Node head=null;
        void push(int val){
            Node newNode = new Node(val);
            newNode.next=head;
            head=newNode;
        }
        int pull(){
            if(head == null) {
                System.out.println("underflow");
                return -1;
            }
            Node temp=head;
            head=head.next;
            return temp.data;
        }
        int peek(){
            return head.data;
        }
        void display(){
            Node temp=head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count =0;
            while(temp != null){
                count++;
                temp=temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(2);
        st.push(5);
        st.push(1);
        st.push(6);
        st.push(11);
        st.push(8);
        st.push(10);
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        st.pull();
        st.pull();
        st.display();
        System.out.println(st.size());

    }
}
