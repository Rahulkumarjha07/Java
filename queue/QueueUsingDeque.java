import java.util.*;

public class QueueUsingDeque {
    public static void main(String[] args) {

        Deque<Integer> d = new LinkedList<>();

        // Enqueue (Insert)
        d.addLast(10);
        d.addLast(20);
        d.addLast(30);
        d.addLast(40);

        // Dequeue (Remove)
        System.out.println("Removed: " + d.removeFirst()); // 10
        System.out.println("Removed: " + d.removeFirst()); // 20

        // Peek
        System.out.println("Front element: " + d.getFirst()); // 30

        // Remaining Queue
        System.out.println("Queue: " + d); // [30, 40]
    }
}
