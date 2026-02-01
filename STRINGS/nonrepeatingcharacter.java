package STRINGS;

import java.util.Arrays;

public class nonrepeatingcharacter{
    public static void main(String args[]){
      
        String str = "leetcode";
        
        char[] naya = str.toCharArray();
        
        
       
        int i=0;

        while(i<naya.length-1){
            if(naya[i] != naya[i+1]){
                System.out.print(naya[i]);
                break;
            }
            i++;
        }


      
    }
}