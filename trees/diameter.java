import java.util.*;
public class diameter{

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

      public int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
      }

      public int dia(Node root){
        if(root == null){
            return 0;
        }
        int leftdia = dia(root.left);
        int rightdia = dia(root.right);
        int lh = height(root.left);
        int rh = height(root.right);

        int selfdia = lh+rh+1;
        return Math.max(selfdia,Math.max(leftdia,rightdia));
      }
        
    }
    
    public static void main(String[] args) {
        
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        Tree t = new Tree();      // create object
        Node root = t.build(nodes);
        
      int res =  t.dia(root);
      System.out.println(res);
       
    }
}
