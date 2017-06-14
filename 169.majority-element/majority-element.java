public class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
            
        int res = 0, cnt = 0;
        for(int num : nums) {
            if(cnt == 0) {
                res = num;
                cnt++;
            }
            else if(res == num)
                cnt++;
            else
                cnt--;
        }
        
        return res;
    }
}