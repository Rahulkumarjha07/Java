public class diagonalsum {

    public static void function(int arr[][]){
        
        int m = arr.length;
        int n = arr[0].length;
        int sum=0;

       /* 
       for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum += arr[i][j];  this is will o(n2 time complexity)
                }
                else if(i+j == n-1){
                    sum = sum +arr[i][j];
                }
            }
        }*/ 

            //below the code for n;

            for(int i=0;i<m;i++){

                sum += arr[i][i];

                if(i != n-1-i )
                    sum = sum + arr[i][n-1-i];
            }


        System.out.println("the sum of the diagonal matrix is: "+sum);

    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {1,2,3,4},
                      {5,6,7,8}

        };

        function(arr);

    }
}
