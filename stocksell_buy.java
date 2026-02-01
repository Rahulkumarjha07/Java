public class stocksell_buy{
    public static void main(String args[]){
    int prices[]  = {7,1,5,3,6,4};
  
    int n = prices.length;

    int max_profit = 0;
    
    int buyprice = 1000000;

    for(int i=0;i<n;i++){
        if(buyprice<prices[i]){
            int profit = prices[i] - buyprice;
            max_profit = Math.max(profit,max_profit);
        }
        else{
            buyprice = prices[i];
        }
    }

   System.out.println("the maximum profit from the stock: "+max_profit);

    }
}