public class AddAtIndex {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add at given index (0-based)
    public void addAtIndex(int data, int index) {

        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        // Case 1: Add at head
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Add at middle or end
        Node temp = head;
        int count = 0;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of range");
            return;
        }

        newNode.next = temp.next;
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
        AddAtIndex list = new AddAtIndex();

        list.addAtIndex(10, 0);
        list.addAtIndex(20, 1);
        list.addAtIndex(30, 2);
        list.addAtIndex(40, 3);

        list.display();

        list.addAtIndex(25, 2); // insert at index 2
        list.display();
    }
}
