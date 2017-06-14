public class Solution {
    public int findDuplicate(int[] nums) {
        int[] array = new int[nums.length];
        int res = -1;
        for(int v : nums) {
            if(array[v] == 1) {
                res = v;
                break;
            }
            if(array[v] == 0)
                array[v] = 1;
        }
        
        return res;    
    }
}