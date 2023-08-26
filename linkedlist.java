

public class linkedlist{
    Node head = null;
    Node tail = null;

    void insertionAtBegning(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
            tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
    }
    void insertionAtEnd(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = temp;
        }
        else {
            tail.next = temp;
        }
        tail = temp;
    }
    void insertionAt(int idx, int val) {
        Node t = new Node(val);
        Node temp = head;
        if(idx == size()) {
            insertionAtEnd(val);
            return;
        }
        else if(idx == 0) {
            insertionAtBegning(val);
            return;
        }
        for(int i=1; i<=idx-1;i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
    }
    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    int getElement(int idx) {
        Node temp  = head;
        for(int i=1; i<=idx; i++) {
            temp = temp.next;

        }
        return temp.data;
    }
    void deleteElement(int idx) {
        if(head != null) {
            if(idx<0 || idx>=size()) {
                System.out.println("wrong Index");
                return;
            }
            else if(idx ==0) {
                head = head.next;
                return;
            }
            else if(idx == size()-1) {
                Node temp = head;
                for(int i=1; i<idx; i++) {
                    temp =temp.next;
                }
                tail = temp;
                temp.next = null;
                return;
            }
            else {
                Node temp = head;
                for(int i=1; i<=idx-1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;

            }
        }
        else {
            System.out.println("The list is empty");
        }
    }
    int size() {
        Node temp =head;
        int count =0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static int length (Node head) {
        Node temp = head;
        int count =0;
        while(temp != null) {
            count++;
            temp =temp.next;
        }
        return count;
    }

    public static void main(String [] args) {
		/*Node a = new Node (5);
		Node b = new Node (3);
		Node c = new Node (14);
		Node d = new Node (15);
		Node e = new Node (16);*/
        linkedlist l1 = new linkedlist();
        //l1.insertionAtEnd(4);
        //l1.insertionAtEnd(5);
        l1.insertionAtBegning(3);
        l1.insertionAtBegning(2);
        l1.insertionAtBegning(1);
        l1.insertionAtBegning(0);
        l1.display();
        l1.deleteElement(3);
        System.out.println("\n");
        l1.display();
        System.out.println();
        System.out.println(l1.tail.data);
        //System.out.println(l1.size());

		/*a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;*/
        //System.out.println(a.next);
        //System.out.println(b);
        //System.out.println(a.next.data);
        //System.out.println(a.next.next);
        //Node temp = a;
		/*for(int i=1; i<=5; i++) {
			System.out.println(temp.data);
			temp = temp.next;
		}*/
		/*while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}*/
        //display(a);
        //System.out.println(length(a));

    }
}
