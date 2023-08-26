package Linkedlist;

public class intersectionOfTwoLL {
    static void display(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        int i=0;
        while(fast.next != null){
            i++;
            fast = fast.next;
            if(i%2==0){
                slow=slow.next;
            }
        }
      return slow;
    }
    static void deleteMiddleNode(Node head){
        Node slow = head;
        Node fast = head;
        int i=0;
        while(fast.next.next.next != null){
            i++;
            fast = fast.next;
            if(i%2==0){
                slow=slow.next;
            }
        }
        slow.next=slow.next.next;
    }
    static void deleteMiddleNode2(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next.next != null && fast.next.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
    }

    static Node findIntersectNode(Node head1, Node head2){
        Node temp1=head1;
        Node temp2=head2;
        int size2=0;
        int size1=0;
        while(temp1 != null){
            size1++;
            temp1=temp1.next;
        }
        while(temp2 != null){
            size2++;
            temp2=temp2.next;
        }
        if(size1>=size2){
            int m = size1-size2;
            temp1=head1;
            temp2 = head2;
            for(int i=1; i<=m; i++){
                temp1=temp1.next;
            }
            while(temp1 != temp2){
               temp1=temp1.next;
               temp2=temp2.next;
            }
            return temp1;
        }
        else{
            int m = size2-size1;
            temp2=head2;
            temp1=head1;
            for(int i=1; i<=m; i++){
                temp2=temp2.next;
            }
            while(temp1 != temp2){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            return temp2;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        Node k = new Node(11);
        Node g = new Node(80);
        Node h = new Node(90);
        Node i = new Node(91);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
       // f.next = k;
        g.next=h;
        h.next=i;

//        Node ans = findIntersectNode(a, g);
//        System.out.println(ans);
//        Node ans = middleNode(a);
//        System.out.println(ans.data);
        display(a);
            deleteMiddleNode2(a);
            display(a);


    }
}
