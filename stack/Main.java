import java.util.Stack;

class Solution {

    public String makeGood(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // BODY LOGIC (case-based)
            if (!st.isEmpty()) {
                char top = st.peek();

                if (Character.toLowerCase(ch) == Character.toLowerCase(top)
                        && ch != top) {
                    st.pop();        // remove bad pair
                } else {
                    st.push(ch);
                }
            } else {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }

        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        String s1 = "leEeetcode";
        String s2 = "abBAcC";
        String s3 = "s";

        System.out.println(sol.makeGood(s1)); // leetcode
        System.out.println(sol.makeGood(s2)); // ""
        System.out.println(sol.makeGood(s3)); // s
    }
}
