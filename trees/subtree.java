import java.util.*;
public class subtree {

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
        public boolean check1(Node node,Node subroot){
            if(node == null && subroot == null){
                return true;
            }
            if(node == null || subroot == null || subroot.data != node.data){
                return false;
            }
            if(!check1(node.left,subroot.left)){
                return false;
            }
            if(!check1(node.right , subroot.right)){
                return false;
            }
            return true;
        }

      public boolean check(Node root, Node subroot){
        if(root==null){
            return false;
        }
        if(root.data == subroot.data){
            if(check1(root,subroot)){
                return true;
            }
        }
        boolean left = check(root.left,subroot);
        boolean right = check(root.right,subroot);
        return left || right;
      }
        
    }
    
    public static void main(String[] args) {
        
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] subnodes = {2,4,-1,-1,5,-1,-1};
        
        Tree t = new Tree();      // create object
        Node root = t.build(nodes);
       Tree t2 = new Tree();
         Node subroot = t2.build(subnodes);  
        
      boolean res =  t.check(root,subroot);
      System.out.println(res);
       
    }
}
