package binarysearchtree;

public class print_in_range{

    

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

    public static void print(Node root, int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
             print(root.left,k1,k2);
            System.out.print(root.data +" ");
            print(root.right,k1,k2);
        }
        else if(root.data < k1){
            print(root.right,k1,k2);
        }
        else{
            print(root.left,k1,k2);
        }

    }

 
    public static void main(String args[]) {

        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = Build(root, values[i]);
        }

        print(root,5,10);

    }    
}