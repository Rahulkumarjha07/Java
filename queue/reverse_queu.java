import java.util.*;


public class  reverse_queu{
    public static void main(String args[]){
        Queue<Integer> q1 = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        q1.add(5);
        q1.add(10);
        q1.add(20);
        while(!q1.isEmpty()){
            s.push(q1.remove());
        }
        while(!s.isEmpty()){
            q1.add(s.pop());
        }
        while(!q1.isEmpty()){
            System.out.println(q1.remove());
        }

        
    }
}