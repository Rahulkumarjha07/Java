public class pair_array_elements {
    public static void main(String args[]){

        int arr[] = {1,2,3,4,4,5,6,7,7,8};

        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }

            System.out.println();
        }

        int total_pairs = (n*(n-1))/2;
        System.out.println("Total number of pairs: " + total_pairs);
    }
}
