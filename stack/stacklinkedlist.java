class Stack {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;   // top of stack

    Stack() {
        top = null;
    }

    // PUSH (Insert)
    void push(int value) {
        Node newNode = new Node(value);

        // Overflow condition (rare)
        if (newNode == null) {
            System.out.println("Stack Overflow");
            return;
        }

        newNode.next = top;
        top = newNode;
        System.out.println(value + " inserted");
    }

    // POP (Delete)
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(top.data + " deleted");
        top = top.next;
    }

    // DISPLAY
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack elements: ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class stacklinkedlist{
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        s.pop();
        s.display();

        s.pop();
        s.pop();
        s.pop();   // underflow
    }
}
