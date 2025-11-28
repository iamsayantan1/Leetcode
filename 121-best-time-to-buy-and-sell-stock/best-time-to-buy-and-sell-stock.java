class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;
        // PRI- 7,1,5,3,6,4
        // MIN- X,7,1,1,1,1
        // MAX- 6,6,6,6,4,N

        int[] min = new int[prices.length];
        int[] max = new int[prices.length];

        min[0]=prices[0];
        for(int i=1; i<prices.length; i++) {
            min[i] = Integer.min(prices[i],min[i-1]);
        }

        max[prices.length-1]=prices[prices.length-1];
        for(int i=prices.length-2; i>=0; i--) {
            max[i] = Integer.max(prices[i],max[i+1]);
        }

        int maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            if(max[i] > min[i] && (max[i]-min[i]) > maxProfit) {
                maxProfit = max[i]-min[i];
            }
        }

        return maxProfit;
    }
}