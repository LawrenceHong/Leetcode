public class NumArray {
    private int[] dp;
    
    public NumArray(int[] nums) {
        dp = nums;
        for (int i = 1; i < nums.length; ++i) {
            dp[i] += dp[i - 1];
        }
    }
    
    public int sumRange(int i, int j) {
        return i == 0? dp[j] : dp[j] - dp[i - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */