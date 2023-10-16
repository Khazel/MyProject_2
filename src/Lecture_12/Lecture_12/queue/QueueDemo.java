package Lecture_12.Lecture_12.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue.toString());
        System.out.println("Remove " + queue.remove());
        System.out.println(queue.toString());
        System.out.println("Peek " + queue.peek());
        System.out.println(queue.toString());
        System.out.println("Poll " + queue.poll());
        System.out.println(queue.toString());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(5);
        System.out.println("Poll " + queue2.poll());
        System.out.println("Remove " + queue2.remove());
    }
}
