class Stack {
    int top;
    int size;
    int[] arr;

    // Constructor
    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // PUSH (Insert)
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
        System.out.println(value + " inserted");
    }

    // POP (Delete)
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(arr[top--] + " deleted");
    }

    // DISPLAY
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackArrayDemo {
    public static void main(String[] args) {

        Stack s = new Stack(5);   // stack size = 5

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        s.pop();
        s.display();

        s.pop();
        s.pop();
        s.pop();  // underflow
    }
}
