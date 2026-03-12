class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class sorted_arry_to_bst {

    // Function to convert sorted array to BST
    public static TreeNode sortedArrayToBST(int[] arr) {
        return buildBST(arr, 0, arr.length - 1);
    }

    public static TreeNode buildBST(int[] arr, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(arr[mid]);

        root.left = buildBST(arr, left, mid - 1);
        root.right = buildBST(arr, mid + 1, right);

        return root;
    }

    // Inorder traversal to print tree
    public static void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int arr[] = {-10, -3, 0, 5, 9};

        TreeNode root = sortedArrayToBST(arr);

        System.out.println("Inorder Traversal of BST:");
        inorder(root);
    }
}