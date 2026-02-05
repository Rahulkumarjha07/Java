public class headinsertion {

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

    // Add node at end
    public void add(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    // Add at head (correct)
    public void addatfirst(int d) {
        Node node = new Node(d);
        node.next = head;
        head = node;
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
        headinsertion list = new headinsertion();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.display();

        list.addatfirst(100);
        list.display();
    }
}
