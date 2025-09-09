class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int min = 0;

        for(int i=1 ; i<prices.length ; i++) {
            if(prices[min]>prices[i]) {
                min=i;
            }
            
            maxProfit = Math.max(prices[i]-prices[min], maxProfit);
        }

        return maxProfit;
    }
}