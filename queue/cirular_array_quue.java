public class cirular_array_quue{
    public static class circular{
        int arr[];
        int size;
        int front= -1;
        int rear = -1;
        circular(int n){
            arr = new int[n];
            size = n;
        }
          public boolean isEmpty(){
            return front == -1 && rear == -1;
          }
          public boolean isFull(){
            return (rear+1)%size == front;
          }
        public void add(int val){
            if(isFull()){
                System.out.println("queue is fulll");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = val;
            
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty cannot be deleted");
                return 0;
            }
            int res = arr[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
            front = (front+1)%size;
            }
            return res;
            

        }

        public int peek(){
            if(isEmpty()){
                System.out.println("queue is Empty");
                return 0;
            }
            
           return arr[front]; 
        }

       
    }
    public static void main(String args[]){
      circular  c = new circular(5);
       c.add(5);
       c.add(4);
       c.add(5);
      
       c.remove();
       c.add(3);
       c.add(2);
       c.add(1);
     
        while(!c.isEmpty()){
            System.out.println(c.peek());
            c.remove();
         }
       
    }
}