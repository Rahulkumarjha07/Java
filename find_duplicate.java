

public class find_duplicate {
    public static void main(String args[]){
        
        int arr[] = {1,9,10,7,11};

        int count=0;

        int n = arr.length;

        java.util.Arrays.sort(arr);

        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
                break;
            }


        }
        if(count>0)
        System.out.println("true");
      else{
        System.out.println("false");
      }
    }
    
}
