public class kadansalgo {
    
    public static void main(String args[]){
        int arr[] = {-2,-3,4,3,1,2,7,4};

        int n = arr.length;

        int curr_sum = 0;

        int max_sum = 0;

        for(int i=0;i<n;i++){
            curr_sum = arr[i];
            if(curr_sum<0){
                curr_sum=0;
            }
        
           max_sum = Math.max(curr_sum,max_sum);
        }
       System.out.println("max_sum of the subarrays is: "+ max_sum);
    }
}
