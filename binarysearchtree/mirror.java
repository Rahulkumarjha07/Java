import java.util.*;

public class mirror {

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

    public static Node fun(Node root){
        if(root==null){
            return null;
        }
        Node leftmirror = fun(root.left);
        Node rightmirror = fun(root.right);

        root.left = rightmirror;
        root.right = leftmirror;
        return root;
    }

    public static void inorder(Node root){
       
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " -> ");
        inorder(root.right);

    }



    // Function to find root to leaf paths
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

        Node mirror = fun(root);

        inorder(mirror);


    }
}