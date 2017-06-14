public class Solution {
    public int coinChange(int[] coins, int amount) {
        if(coins == null || coins.length == 0 || amount <= 0)
            return 0;
        int[] res = new int[amount+1];
        for(int i = 1; i <= amount; i++) {
            res[i] = Integer.MAX_VALUE;
            for(int j = 0; j < coins.length; j++) {
                if(coins[j] <= i && res[i - coins[j]] != Integer.MAX_VALUE)
                    res[i] = Math.min(res[i], 1 + res[i-coins[j]]);
            }
        }
        if(res[amount] == Integer.MAX_VALUE)
            return -1;
        else
            return res[amount];
    }
}