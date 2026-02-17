import java.util.*;
public class  sumofnodes{

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Tree {
        int index = -1;

        public Node build(int[] nodes) {
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);

            newNode.left = build(nodes);
            newNode.right = build(nodes);

            return newNode;
        }

      public int sum(Node root){
         if(root == null){
            return 0;
         }
         int leftsum = sum(root.left);
         int rightsum = sum(root.right);
         return leftsum+rightsum+root.data;
      }
        
    }
    
    public static void main(String[] args) {
        
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        Tree t = new Tree();      // create object
        Node root = t.build(nodes);
        
      int res =  t.sum(root);
      System.out.println(res);
       
    }
}
