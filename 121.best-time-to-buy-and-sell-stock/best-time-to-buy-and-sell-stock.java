public class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minN = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            minN = Math.min(minN, prices[i]);
            maxP = Math.max(maxP, prices[i] - minN);
        }
        
        return maxP;
    }
}