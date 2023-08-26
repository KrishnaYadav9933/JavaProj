package Linkedlist;

public class mergeTwoSortedLL {
    static void display(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static Node mergeLL(Node head1, Node head2){
        Node head;
        Node temp1=head1;
        Node temp2=head2;
        if(temp1.data<=temp2.data){
         head=new Node(temp1.data);
        temp1=temp1.next;
        }
        else{
            head = new Node(temp2.data);
            temp2=temp2.next;
        }
        Node temp = head;
        while(temp1 != null && temp2 !=null){
            if(temp1.data<=temp2.data){
                Node t = new Node(temp1.data);
                temp.next=t;
                temp =t;
                temp1=temp1.next;
            }
            else{
              Node t = new Node(temp2.data);
              temp.next=t;
              temp = t;
              temp2=temp2.next;
            }
        }
        while(temp1 != null){
            Node t = new Node(temp1.data);
            temp.next=t;
            temp=t;
            temp1=temp1.next;
        }
        while(temp2 != null){
            Node t = new Node(temp2.data);
            temp.next=t;
            temp=t;
            temp2=temp2.next;
        }
        return head;

    }
    static Node mergeLL2(Node head1, Node head2){
        Node head;
        Node temp1=head1;
        Node temp2 = head2;
        if(temp1.data<=temp2.data){
            head=head1;
            temp1 = temp1.next;
        }
        else{
            head=head2;
            temp2=temp2.next;
        }
        Node temp = head;
        while(temp1 != null && temp2 != null){
            if(temp1.data<=temp2.data){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next = temp2;
                temp = temp2;
                temp2=temp2.next;
            }
        }
        while(temp1 != null){
            temp.next = temp1;
            temp=temp1;
            temp1=temp1.next;
        }
        while(temp2 != null){
            temp.next = temp2;
            temp=temp2;
            temp2=temp2.next;
        }
        return head;
    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(10);
        Node d = new Node(4);
        Node e = new Node(100);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(101);
        Node i = new Node(9);
        a.next = c;
        c.next = e;
        e.next = h;
        b.next = d;
        d.next = f;
        f.next = g;
        g.next = i;
        Node k = mergeLL2(a,b);
        display(k);

    }
}
