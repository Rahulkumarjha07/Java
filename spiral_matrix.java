public class spiral_matrix {

    public static void spiral(int arr[][]){
        
        int startrow = 0;
        int startcolumn = 0;

        int endrow = arr.length-1;
        int endcolumn = arr[0].length-1;

        while((startrow <= endrow )&&(startcolumn <= endcolumn)){
            //top
            for(int j=startcolumn;j<=endcolumn;j++){
                System.out.print(arr[startrow][j] +" ");
            }

            //right

            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcolumn] + " ");
            }

            //bottom

             for(int j = endcolumn-1;j>=startcolumn;j--){
                if (startrow == endrow) break;
                System.out.print(arr[endrow][j]+ " ");
            }

            //left

            for(int i=endrow-1;i>startrow;i--){
                System.out.print(arr[i][startcolumn] +  " ");
                if (startcolumn == endcolumn) break;
            }

            startcolumn++;
            startrow++;
            endrow--;
            endcolumn--;

            
        }

        
    }

    public static void main(String args[]){
   
        int arr[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {1,2,3,4},
                      {5,6,7,8}

        };

        spiral(arr);


    }
    
}
