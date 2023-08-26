import java.util.*;

public class queueInterfaceExample {
    static void DequeExamples(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
    static void QueueExm(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
    }
    static void prioriityQueueEx(){                        //By default
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //min priority queue
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); //5 - the smallest element has highest priority
        System.out.println(pq);  //top priority elt will be processed first
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
    }

    public static void main(String[] args) {
       // QueueExm();
//        prioriityQueueEx();
    DequeExamples();
    }
}
