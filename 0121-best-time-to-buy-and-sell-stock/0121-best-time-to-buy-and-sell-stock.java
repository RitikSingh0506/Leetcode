class Solution {
    public int maxProfit(int[] prices) {
        int profit,max_profit=0;
        int buyPrice=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                profit=prices[i]-buyPrice;
            
            if(max_profit<profit){
                max_profit=profit;
            }}
            if(buyPrice>prices[i]){
                buyPrice=prices[i];
            }
           
        }
         return max_profit;
    }
}