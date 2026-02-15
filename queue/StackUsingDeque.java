import java.util.*;

public class StackUsingDeque {
    public static void main(String[] args) {

        Deque<Integer> d = new LinkedList<>();

        // Push (like stack push)
        d.addLast(1);
        d.addLast(2);
        d.addLast(3);
        d.addLast(4);

        // Pop (like stack pop)
        System.out.println(d.removeLast());  // 4
        System.out.println(d.removeLast());  // 3

        // Peek (like stack peek)
        System.out.println(d.getLast());     // 2

        // Print remaining stack
        System.out.println(d);               // [1, 2]
    }
}
