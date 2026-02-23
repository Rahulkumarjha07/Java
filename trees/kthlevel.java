import java.util.*;
public class kthlevel{

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

       
       public void level(Node root, int level, int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.println(root.data);
            return;
        }
        level(root.left,level+1,k);
        level(root.right,level+1,k);

       }
        
    }
    
    public static void main(String[] args) {
        
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        Tree t = new Tree();      // create object
        Node root = t.build(nodes);
        
        t.level(root,1,3);
       
    }
}
