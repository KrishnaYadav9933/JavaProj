package Linkedlist;

public class maxTwinSum {
    static Node reverse(Node head){
        if(head.next==null) return head;
       Node newHead = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;

    }
    static int maxTSum(Node head){
        int sum= Integer.MIN_VALUE;
        Node slow=head;
        Node fast=head;
        while(fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node rev=reverse(slow.next);
        Node t = head;
        while(rev != null){
            int s= rev.data+t.data;
            if(s>sum){
                sum=s;
            }
            rev=rev.next;
            t=t.next;
        }
        return sum;
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
        Node b = new Node(4);
        Node c = new Node(5);
        Node f = new Node(10);
        Node g = new Node(12);
        Node h = new Node(2);
        a.next=b;
//        b.next=c;
//        c.next=f;
//        f.next=g;
//        g.next=h;
//        h.next=null;
        System.out.println(maxTSum(a));
    }
}
