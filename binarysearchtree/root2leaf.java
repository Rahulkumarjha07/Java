import java.util.*;

public class root2leaf {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Function to print path
    public static void print(ArrayList<Integer> path) {
        int n = path.size();
        for (int i = 0; i < n; i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("NULL");
    }

    // Function to find root to leaf paths
    public static void leaf(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }

        // add current node
        path.add(root.data);

        // check leaf node
        if (root.left == null && root.right == null) {
            print(path);
        } else {
            leaf(root.left, path);
            leaf(root.right, path);
        }

        // backtracking
        path.remove(path.size() - 1);
    }

    public static void main(String args[]) {

        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> path = new ArrayList<>();

        leaf(root, path);
    }
}