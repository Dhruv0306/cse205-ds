class Solution {
    public int buyChoco(int[] prices, int money) {
        int len = prices.length;
        if(len == 2){
            if(prices[0]+prices[1]>money)return money;
            else return (money - prices[0] - prices[1]);
        }else{
            Arrays.sort(prices);
            int temp = prices[0] + prices[1];
            return (temp > money)?money:money-temp;
        }
    }
}