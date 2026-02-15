import java.util.*;
public class double_ended_queue{
    public static void main(String args[]){
        Deque<Integer> d = new LinkedList<>();
        
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(30);
        d.addLast(40);
        System.out.println(d);
        

    }
}