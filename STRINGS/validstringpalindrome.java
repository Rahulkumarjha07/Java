package STRINGS;

public class validstringpalindrome{

    public static boolean check2(String str){

        int start = 0;
        int end = str.length()-1;

        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void check(String str){
       
        StringBuilder sb = new StringBuilder();
         
        for(int i=0;i<str.length();i++){
            
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
                
            }
        }

        String naya = sb.toString();

        if(check2(naya)){
            System.out.print("is a palindrome");
        }
        else{
            System.out.print("not a plaindrome");
        }


    }
    public static void main(String args[]){
        String str = "A man, a plan, a canal: Panama";
        check(str);
    }
}
