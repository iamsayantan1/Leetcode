class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int dailyProfit=0;
        int len=prices.length;
        int min = 0;

        for(int i=1 ; i<len ; i++) {
            if(prices[min]>prices[i]) {
                min=i;
            }

            dailyProfit = prices[i]-prices[min];
            
            if(dailyProfit>maxProfit) {
                maxProfit = dailyProfit;
            }
        }

        return maxProfit;
    }
}