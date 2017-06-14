public class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int v : nums) {
            min = Math.min(min, v);
            sum += v;
        }
        
        return sum - nums.length * min;    
    }
}