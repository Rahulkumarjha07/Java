

public class selectionsort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int arr[]){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            int minindex = i;

            for(int j = i+1; j<n;j++){
                if(arr[minindex] > arr[j]){
                  minindex = j;  
                }
            }

            swap(arr,minindex,i);
           
        }
    }

    public static void main(String args[]){
     int arr[] = {10,6,90,7,100,98,88};

        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
         } 

        
    }
}
