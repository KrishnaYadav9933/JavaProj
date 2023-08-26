package Linkedlist;

public class splitLL {
    static void display(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static Node oddEvenDiv(Node head){
        Node temp = head;
        Node eHead = new Node(1000);
        Node oHead = new Node(1001);
        Node eTemp=eHead;
        Node oTemp=oHead;
        while(temp != null){
            if(temp.data %2==0){
                Node t = new Node(temp.data);
               eTemp.next=t;
               eTemp=t;
               temp=temp.next;
            }
            else{
                Node t = new Node(temp.data);
                oTemp.next=t;
                oTemp=t;
                temp=temp.next;
            }
        }
        eTemp.next=oHead.next;
        return eHead.next;
    }
    static Node oddEvenDiv2(Node head){
        Node temp = head;
        Node eHead = new Node(1000);
        Node oHead = new Node(1001);
        Node eTemp=eHead;
        Node oTemp=oHead;
        while(temp != null){
            if((temp.data)%2==0){
                eTemp.next=temp;
                eTemp=temp;
                temp=temp.next;
            }
            else{
                oTemp.next=temp;
                oTemp=temp;
                temp=temp.next;
            }
        }
        oTemp.next=null;
        eTemp.next=oHead.next;
        return eHead.next;
    }
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(7);
            Node c = new Node(8);
            Node d = new Node(9);
            Node e = new Node(10);
            Node f = new Node(11);
            Node g = new Node(2);
            Node h = new Node(4);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
            f.next=g;
            g.next=h;
            Node ans = oddEvenDiv2(a);
            display(ans);

        }
    }

