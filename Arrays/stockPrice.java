package Arrays;

public class stockPrice {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minCost = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] > minCost){
                if((prices[i] - minCost) > profit){
                    profit = prices[i] - minCost;
                }
            }else{
                minCost = prices[i];
            }
        }
        return profit;
   }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println("The max Profit = "+profit);
    }
}
