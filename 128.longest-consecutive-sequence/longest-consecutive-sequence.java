public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2) return nums.length;
        
        Arrays.sort(nums);
        //System.out.println(nums[1]);
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++) {
            int count = 1;
            while(i < nums.length && (nums[i-1]+1 == nums[i] || nums[i-1] == nums[i])) {
                if(nums[i-1] == nums[i]) {
                    i++;
                    continue;
                }
                else if (nums[i-1]+1 == nums[i]) {
                    i++;
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        
        return max;
    }
}