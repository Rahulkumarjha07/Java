package STRINGS;



public class palindrome{

    public static boolean check(String str){

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
    public static void main(String args[]){

        String st1 = "noon";
        

        if(check(st1)){
           System.out.println("palindrome");
        }
        else{
            System.out.println("not a plaindrome");
        }
        
        

    }
}