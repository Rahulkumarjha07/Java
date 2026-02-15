import java.util.*;
public class first_non_repeating_char{

    public static void function(String s){
        int[] freq = new int[26];

        Queue<Character> q1 = new LinkedList<>();
       
        int n = s.length();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            q1.add(ch);
            freq[ch-'a']++;

            while(!q1.isEmpty() && freq[q1.peek()-'a']>1){
                q1.remove();
            }
            if(q1.isEmpty()){
                System.out.println(-1+" ");
            }
            else{
                System.out.println(q1.peek());
            }

        }

    }
    public static void main(String args[]){
        String s = "aabccdd";
           function(s);
    }
}