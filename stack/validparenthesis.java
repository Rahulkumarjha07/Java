import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }
}

public class validparenthesis{
    public static void main(String[] args) {

        Solution sol = new Solution();

        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "{[()]}";

        System.out.println(s1 + " -> " + sol.isValid(s1)); // true
        System.out.println(s2 + " -> " + sol.isValid(s2)); // false
        System.out.println(s3 + " -> " + sol.isValid(s3)); // true
    }
}
