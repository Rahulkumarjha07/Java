import java.util.*;

public class duplicate_parenthesis {

    public static boolean isduplicate(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Closing bracket
            if (ch == ')') {
                int count = 0;

                while (!st.isEmpty() && st.peek() != '(') {
                    st.pop();
                    count++;
                }

                if (count == 0) {
                    return true; // duplicate found
                }

                st.pop(); // remove '('
            } 
            else {
                st.push(ch);
            }
        }

        return false;
    }

    public static void main(String args[]) {
        String s1 = "((1)+(2))";
        String s2 = "((a+b))";
        String s3 = "(a+b)";

        System.out.println(isduplicate(s1)); // false
        System.out.println(isduplicate(s2)); // true
        System.out.println(isduplicate(s3)); // false
    }
}
