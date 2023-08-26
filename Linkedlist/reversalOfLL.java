package Linkedlist;

public class reversalOfLL {
    static boolean checkPalindrome(Node head){
        Node head1 = new Node(head.data);
        Node temp1 = head1;
        Node temp=head.next;
        while(temp != null){
            Node t = new Node(temp.data);
            temp1.next = t;
            temp1=t;
            temp=temp.next;
        }
        Node rev= Reverse(head1);
        temp=head;
        temp1=rev;
        while(temp != null){
            if(temp.data != temp1.data) return false;
            temp=temp.next;
            temp1=temp1.next;
        }
        return true;
    }
    static boolean checkPalindrome2(Node head){
        Node slow=head;
        Node fast = head;
        while(fast.next!= null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node rev= Reverse(slow.next);
        slow.next = rev;
        Node t1 = head;
        Node t2 = slow.next;
        while(t2 != null){
            if(t1.data != t2.data) return false;
            t1=t1.next;
            t2=t2.next;
        }
        return true;
    }
    static Node recurSwap(Node head){
        if(head==null || head.next==null) return head;
        Node temp=head.next;
        head.next=recurSwap(head.next.next);
        temp.next=head;
        return temp;
    }

    static void display(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    static void reverseDisplay(Node head){
        if(head==null) return;
        reverseDisplay(head.next);
        System.out.print(head.data+" ");
    }
    static Node recursiveReverse(Node head){
        if(head.next == null) return head;
        Node newHead=recursiveReverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    static Node Reverse(Node head){
        Node prev=null;
        Node agla=null;
        Node curr=head;
        while(curr != null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(5);
        a.next=b;
      //  b.next=c;
      //  c.next=d;
      //  d.next=e;
      //  display(a);
       // System.out.println();
//        System.out.println(checkPalindrome2(a));
       Node p= recurSwap(a);
       display(p);
    }
}
