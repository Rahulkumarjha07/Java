import java.util.*;
public class levelorder{

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

       public void inorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node current = q.remove();
            System.out.println(current.data);
            if(current.left != null){
                q.add(current.left);
            }
             if(current.right != null){
                q.add(current.right);
             }
        }


       }
        
    }
    
    public static void main(String[] args) {
        
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        Tree t = new Tree();      // create object
        Node root = t.build(nodes);
        
        t.inorder(root);
       
    }
}
