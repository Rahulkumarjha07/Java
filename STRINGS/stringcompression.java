package STRINGS;

public class stringcompression {

    public static void compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++; // ✅ important
            }

            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String args[]) {
        String str = "aaaabbbccccdde";
        compress(str);
    }
}
