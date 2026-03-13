import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class bst_to_balanced_bst {

    // Store inorder traversal
    public static void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    // Build balanced BST from sorted array
    public static TreeNode buildBalanced(ArrayList<Integer> list, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = buildBalanced(list, left, mid - 1);
        root.right = buildBalanced(list, mid + 1, right);

        return root;
    }

    // Main function to balance BST
    public static TreeNode balanceBST(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        return buildBalanced(list, 0, list.size() - 1);
    }

    // Print inorder traversal
    public static void printInorder(TreeNode root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        // Example unbalanced BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(7);
        root.left.left.left = new TreeNode(6);
        root.left.left.left.left = new TreeNode(5);

        System.out.println("Original BST Inorder:");
        printInorder(root);

        root = balanceBST(root);

        System.out.println("\nBalanced BST Inorder:");
        printInorder(root);
    }
}