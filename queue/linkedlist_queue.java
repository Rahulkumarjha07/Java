public class linkedlist_queue{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class queue{

        Node head = null;
        Node tail = null;

        public boolean isEmpty(){
            return head==null && tail == null;
        }

        public  void add(int val){
            Node newnode = new Node(val);
            if(head==null){
                tail = head = newnode;
                return;
            }
            
            tail.next = newnode;
            tail = newnode;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("queue is Empty");
                return 0;
            }
            int res = head.data;
            if(head == tail){
                tail = null;
                head = null;
            }
            else{
            head = head.next;
            }
            return res;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("queue is Empty");
                return 0;
            }
            return head.data;
        }

    }
    public static void main(String args[]){
       queue s = new queue();
       s.add(5);
       s.add(10);
       s.add(15);
       s.add(20);
       s.remove();
       s.remove();
       s.remove();

       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.remove();
       }
    }
}