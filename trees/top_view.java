import java.util.*;

class  top_view{

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Pair {
        TreeNode node;
        int hd;   // horizontal distance

        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static List<Integer> topView(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair curr = q.poll();
            TreeNode node = curr.node;
            int hd = curr.hd;

            // Store first node at each horizontal distance
            if (!map.containsKey(hd)) {
                map.put(hd, node.val);
            }

            min = Math.min(min, hd);
            max = Math.max(max, hd);

            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1));
            }

            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1));
            }
        }

        // Collect result from leftmost to rightmost
        for (int i = min; i <= max; i++) {
            result.add(map.get(i));
        }

        return result;
    }

    // ✅ MAIN METHOD ADDED HERE
    public static void main(String[] args) {

        // Creating tree manually
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);

        List<Integer> result = topView(root);

        System.out.println("Top View of Binary Tree:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
