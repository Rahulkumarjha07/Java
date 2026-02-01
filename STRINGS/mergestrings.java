package STRINGS;

public class mergestrings {
	public static void main(String[] args) {
		
		String str1 = "rahul";
		String str2 = "sonu";

		StringBuilder sb = new StringBuilder();

		
		int i=0;
		int j=0;

		while(i<str1.length() && j<str2.length()){
          
			sb.append(str1.charAt(i));
			sb.append(str2.charAt(i));
			
               i++;
			   j++;
		}

		while(i<str1.length()){
          
			sb.append(str1.charAt(i));
			
			
               i++;
			   
		}

		while(i<str1.length()){
          
			sb.append(str1.charAt(j));
			
			
               j++;
			   
		}

		System.out.println(sb.toString());

		


		


		
	}
}

