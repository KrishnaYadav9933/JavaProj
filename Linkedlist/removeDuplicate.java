package Linkedlist;

public class removeDuplicate {
    static void display(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static void removeDup(Node head){
        Node temp = head;
        Node temp1;
        if(head.next != null){
            temp1=head.next;
        }
        else{
            return;
        }
        while(temp1 != null){
            if(temp1.data == temp.data){
                temp.next=null;
                temp1=temp1.next;
            }
            else{
                temp.next = temp1;
                temp=temp1;
                temp1=temp1.next;
            }
        }
    }
    public  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(5);
        Node c = new Node(5);
        Node k = new Node(5);
        Node l = new Node(5);
        a.next=b;
        b.next=c;
        c.next=k;
        k.next=l;
        display(a);
        removeDup(a);
        display(a);

    }
}
