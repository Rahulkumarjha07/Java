import java.util.*;

public class stack_using_2queue {

    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push operation
        public void add(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop operation
        public int remove() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            // Case 1: elements in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            }
            // Case 2: elements in q2
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();

        s.add(10);
        s.add(20);
        s.add(30);

        System.out.println(s.remove()); // 30
        System.out.println(s.remove()); // 20
        System.out.println(s.remove()); // 10
    }
}
