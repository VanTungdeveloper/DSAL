package queue;

import java.util.Iterator;

public class QueueTest {
    public static void main(String[] args) {
        final int LENGTH = 10;

        QueueADT<Integer> linkedListBasedQueue = new LinkedListBasedQueue<>();

        for (int i = 0; i< LENGTH; i++){
            linkedListBasedQueue.enQueue(i);
        }
        
        Iterator<Integer> iterator = linkedListBasedQueue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(linkedListBasedQueue.toString());

    }
}