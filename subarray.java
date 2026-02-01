public class subarray {
    
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};

        int n = arr.length;

        int max = 0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum =0 ;
                for(int  k=i;k<=j;k++){
                   
                    sum = sum + arr[k];
                }
                
                if(sum>max){
                    max = sum;
                }
               

                
            }

            
        }

        System.out.println("the maximum subarray element is: "+ max);
    }

}
