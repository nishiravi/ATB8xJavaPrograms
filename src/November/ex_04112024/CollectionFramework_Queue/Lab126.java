package November.ex_04112024.CollectionFramework_Queue;

import java.util.PriorityQueue;

public class Lab126 {
    public static void main(String[] args) {
        // Queue -First In First Out
        // output sorting is not done
        // allows to add duplicate items
        PriorityQueue<Integer>  a=new PriorityQueue<>();
        a.offer(1);
        a.offer(2);
        a.offer(5);
        a.offer(3);
        a.offer(4);
        a.offer(5);
        a.offer(5);
        System.out.println(a);
        System.out.println(a.peek()); // to check peek the  item in the queue
        System.out.println(a.poll());// to remove the item
        System.out.println(a);
    }
}
