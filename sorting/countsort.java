package sorting;

public class countsort {
    public static void main(String args[]){
        int arr[] = {1,5,4,3,1,2,1,10,2,5,4,3,2,1};

        int n = arr.length;

        int count[] = new int[n+1];

        int max = 0;

        for(int i=0;i<n;i++){
           
            max = Math.max(max,arr[i]);
        }

        for(int i=0;i<n;i++){
            
            count[arr[i]]++;
        }

          int j=0;
        for(int i=0;i<count.length;i++){
         
             while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
             }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

    }
}
