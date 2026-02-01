public class reversearray {

    public static void reversearry(int arr[], int n){
        int start = 0;
        int end = n-1;

        int temp = 0;

        while(start<end){
             temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
         int n = arr.length;
       
         reversearry(arr,n);

         for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
         }

    }
}
