public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int v : nums1) {
            if(map.containsKey(v)) {
                map.put(v, map.get(v) + 1);
            }
            else
                map.put(v, 1);
        }
        
        List<Integer> res = new ArrayList<>();
        for(int v : nums2) {
            if(map.containsKey(v) && map.get(v) > 0) {
                res.add(v);
                map.put(v, map.get(v) - 1);
            }
        }
        
        int[] ret = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
            ret[i] = res.get(i);
        return ret;    
    }
}