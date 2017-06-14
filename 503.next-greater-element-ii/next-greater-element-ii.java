public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = -1;    
        }
        
        if(nums.length == 1) return res;
        
        for(int i = 0; i < nums.length; i++) {
            // int z = 0;
            // while(z < )
            for(int j = i, z = 0; z< nums.length; j = (j+1)%nums.length, z++) {
                //System.out.println(j);
                if(nums[j] > nums[i]) {
                    res[i] = nums[j];
                    break;
                }
            }
        }
        
        return res;
    }
}