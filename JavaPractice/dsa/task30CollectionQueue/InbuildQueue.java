package dsa.task30CollectionQueue;

import java.util.LinkedList;
import java.util.Queue;

public class InbuildQueue {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(1);
        queue.add(2);
        queue.add(5);

        System.out.println(queue);

        System.out.println("peek element from queue : "+queue.peek());

        System.out.println("poll element from queue : "+queue.poll());

        System.out.print("After poll queue is : ");

        System.out.print(queue);

    }
}
