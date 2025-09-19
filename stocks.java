public class stocks{
	public static int maxProfit(int prices[]){
		//minimum price, max profit
		int profit = 0; //
		int minPrice = prices[0]; //
		// prices = {3,4,1,5} minPrice = 3
		for(int i = 0; i < prices.length; i++){
			if(minPrice > prices[i]){
				minPrice = prices[i];
			}
			else if(prices[i] - minPrice > profit){
				profit = prices[i] - minPrice;
			}
		}
		return profit;
	}
}