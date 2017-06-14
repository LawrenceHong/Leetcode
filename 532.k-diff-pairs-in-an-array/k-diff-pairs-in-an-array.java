public class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0 || nums == null || nums.length  == 0)  return 0;
        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int v : nums)
            map.put(v, map.getOrDefault(v, 0) + 1);
        for(Integer key : map.keySet()) {
            if(k == 0) {
                if(map.get(key) > 1)
                    count++;
            }
            else
                if(map.containsKey(key+k)) count++;
        }
        
        return count;
    }
}