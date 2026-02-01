public class sortcolor {

          public static void fun(int arr[], int n){
        int left=0;
        int middle = left+1;
        int right = n-1;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[left] = 0;
                left++;
            }
            else if(arr[i]==1){
                arr[middle] = 1;
                middle++;
            }
            else{
                arr[right] == 2;
                right--;
            }

        }
       }
    public static void main(String args[]){
        int arr[] = {2,1,0,0,2,0,1,2,1,0,0,2,2,1};

        int n = arr.length;

        fun(arr,n);
    }
}
