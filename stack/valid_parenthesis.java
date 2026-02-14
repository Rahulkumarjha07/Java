import java.util.*;

public class valid_parenthesis {

    public static boolean isvalid(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }
            // Closing brackets
            else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty(); // Important final check
    }

    public static void main(String args[]) {
        String s1 = "[[]]";
        String s2 = "[[][][][][][]]";
        String s3 = "[[[][][][][]{}}{";

        System.out.println(isvalid(s1)); // true
        System.out.println(isvalid(s2)); // true
        System.out.println(isvalid(s3)); // false
    }
}
