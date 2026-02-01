public class bubblesort{

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int arr[]){
        int n = arr.length;
 
         for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j+1,j);
                }
            }
         }

         for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
         } 
        
    }

    public static void main(String args[]){
        int arr[] = {10,6,90,7,100,98,88};

        sort(arr);

    }
}