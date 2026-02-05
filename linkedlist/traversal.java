class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class traversal {

    Node head;  

    public void insert(int data) {
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

    public void print() {
        Node temp = head;

        if (temp == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        traversal list = new traversal();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.print();
    }
}
