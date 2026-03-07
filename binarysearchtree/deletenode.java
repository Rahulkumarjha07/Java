package binarysearchtree;

public class deletenode {

    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    // Build BST
    public static Node Build(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val > root.data) {
            root.right = Build(root.right, val);
        } else {
            root.left = Build(root.left, val);
        }
        return root;
    }

    // Find Inorder Successor
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete Node
    public static Node delete(Node root, int val) {

        if (root.data > val) {
            root.left = delete(root.left, val);
        } 
        else if (root.data < val) {
            root.right = delete(root.right, val);
        } 
        else {

            // case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2: one child
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // case 3: two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    // Inorder Traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {

        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = Build(root, values[i]);
        }

        System.out.println("Before Deletion:");
        inorder(root);

        root = delete(root, 10);

        System.out.println("\nAfter Deletion:");
        inorder(root);
    }
}