package Linkedlist;

public class cycleInLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static boolean checkCycle(Node head){
        Node slow=head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
    static Node startPoint(Node head){
        Node slow= head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }

        }
        Node temp=head;
        while(temp != slow){
            temp=temp.next;
            slow=slow.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(10);
        Node c = new Node(101);
        Node d = new Node(102);
        Node e = new Node(103);
        a.next=a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = b;
        System.out.println(startPoint(a).data);
    }
}
