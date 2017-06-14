public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet();
        
        if(nums.length == 1) {
            return false;
        }
        
        for(int v : nums) {
            if(set.contains(v) == true) {
                return true;
            }
            
            set.add(v);
        }
        
        return false;
    }
}