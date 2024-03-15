

public class stocks {
    public static int buyandSellStocks(int prices[]){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 1; i<prices.length; i++){
            if (buy_price<prices[i]) {
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            }
            else{
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
       int profit_stock =  buyandSellStocks(prices);

       System.out.println("the Total profit was : "+profit_stock);
    }
}
