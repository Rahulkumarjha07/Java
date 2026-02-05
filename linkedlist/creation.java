public class creation {

    // ✅ Class-level head
    Node head;

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node (at end)
    public void add(int data) {
        Node newnode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newnode;
            return;
        }

        // Traverse till last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link last node to new node
        temp.next = newnode;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        creation list = new creation();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.display(); // ✅ call display
    }
}
