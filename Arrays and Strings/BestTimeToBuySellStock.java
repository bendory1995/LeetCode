public class BestTimeToBuySellStock{
    public static void main(String[] args){

    }
    //O(n) Solution
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        int curProfit = 0;
        for(int i = 1; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            curProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, curProfit);
        }
        return maxProfit;
    }
}