package STRINGS;

public class ip {

    public static void ip(String str) {
        StringBuilder sb = new StringBuilder(); 
        
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            
            if (current == '.') {
                sb.append("[.]"); 
            } else {
                sb.append(current);
            }
        }

        System.out.println(sb.toString());
    }

    // Corrected: 'String' must be capitalized
    public static void main(String args[]) { 
        String str = "1.1.1.1";
        ip(str);
    }
}