import java.util.*;

public class reverse_string{
    public static void check(String s){
     int n = s.length();
     Stack<Character> s1 = new Stack<>();

     int index=0;

     while(index<n){
      s1.push(s.charAt(index));
      index++;
     }

     StringBuilder sb = new StringBuilder();

     while(!s1.isEmpty()){
        char add = s1.pop();
        sb.append(add);

     }
     System.out.println(sb.toString());
    }


    public static void main(String args[]){
        String s = "rahul";
        check(s);
    }
}