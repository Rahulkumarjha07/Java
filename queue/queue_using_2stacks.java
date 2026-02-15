import java.util.*;

public class queue_using_2stacks {

    // Push Costly
    public static void push_function(Stack<Integer> s1, Stack<Integer> s2, int value) {

        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push new element into s1
        s1.push(value);

        // Move everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static int pop_function(Stack<Integer> s1) {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }

    public static void main(String args[]) {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        push_function(s1, s2, 10);
        push_function(s1, s2, 20);
        push_function(s1, s2, 30);
        push_function(s1, s2, 40);
        push_function(s1, s2, 5);

        System.out.println("Removed: " + pop_function(s1));

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
