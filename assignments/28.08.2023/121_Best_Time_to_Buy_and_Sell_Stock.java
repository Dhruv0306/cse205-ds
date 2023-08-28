class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        return getMaxProfit(prices, 0, Integer.MAX_VALUE, 0);
    }
    
    public int getMaxProfit(int[] prices, int index, int minStockPrice, int maxDiff) {
        if(prices.length == index) {
            return maxDiff;
        }
         int earn =  prices[index] - minStockPrice;
         maxDiff = Math.max(earn, maxDiff);
         minStockPrice = Math.min(minStockPrice, prices[index]);
        return getMaxProfit(prices, ++index, minStockPrice, maxDiff);
    }
}