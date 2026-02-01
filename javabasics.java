import java.util.Scanner;

public class javabasics{

    public static boolean ispresent(int element,int arr[],int length){
        int count = 0;

        java.util.Arrays.sort(arr);
        int start=0;
        int end = length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == element){
                count++;
            }
            else if(element > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(count>1){
            return true;
        }
        else{
            return false;
        }

    }






    public static void main(String[]  args){
       
     Scanner sc = new Scanner(System.in);

      int arr[] = {2,4,5,7,9,2,10};

      int length = arr.length;

      for(int i=0;i<length;i++){
        if(ispresent(arr[i],arr,length)){
            System.out.println("element found: "+ arr[i]);
            break;
        }
      }

      sc.close();


    }
    
}