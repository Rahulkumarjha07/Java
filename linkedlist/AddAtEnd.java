public class AddAtEnd {

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

    // ADD AT END
    public void addAtEnd(int data) {
        Node newNode = new Node(data);

        // Case 1: Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        // Case 2: Non-empty list
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link last node to new node
        temp.next = newNode;
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

    public static void main(String[] args) {
        AddAtEnd list = new AddAtEnd();
        
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);

        list.display();
    }
}
