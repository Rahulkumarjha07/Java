import java.util.*;
public class reverse_stack{

    public static void perform(Stack<Integer> s){
        if(!s.isEmpty()){
            return;
        }
        int top = s.pop();
        perform(s);
        s.push(top);

    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

      perform(s);  
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}