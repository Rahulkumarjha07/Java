package binarysearchtree;

public class search{
       static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
        }
       }

       public static  Node insert(Node root,int val){
       if(root==null){
          root = new Node(val);
          return root;
       }
       if(root.data > val){
        //left subtree;
        root.left = insert(root.left,val);
       }
       else if(root.data < val){
        root.right  = insert(root.right,val);
       }

       return root;
       }

       public static boolean searchfunction(Node root, int key){
        if(root == null){
            return false;
        }
       if(root.data == key){
        return true;
       }
       else if(root.data > key){
        return searchfunction(root.left,key);
       }
       else{
        return searchfunction(root.right,key);
       }
       }
    public static void main(String args[]){
    int val[] = {5,1,3,4,2,7};
    Node root=null;
    int n = val.length;
      for(int i=0;i<n;i++){
        root = insert(root,val[i]);
      }
      if(searchfunction(root,6)){
        System.out.println("found");
      }
      else{
         System.out.println("not found");
      }
    }
}