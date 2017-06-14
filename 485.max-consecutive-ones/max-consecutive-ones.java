public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tmp = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] == 1)
                tmp++;
            else
                tmp = 0;
                
            max  = Math.max(max, tmp);
        }
        
        return max;
    }
}