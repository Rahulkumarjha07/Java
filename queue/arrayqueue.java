public class arrayqueue {

    static class Queue {
        int arr[];
        int size;
        int rear = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int val) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = val;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.peek());    // 10
        System.out.println(q.remove());  // 10
        System.out.println(q.peek());    // 20
    }
}
