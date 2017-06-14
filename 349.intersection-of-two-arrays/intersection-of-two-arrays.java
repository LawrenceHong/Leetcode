public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int v : nums1)
            map.put(v, map.getOrDefault(v, 0) + 1);
        
        HashSet<Integer> results = new HashSet<>();
        
        for (int i = 0; i < nums2.length; ++i)
            if (map.containsKey(nums2[i]) &&
                map.get(nums2[i]) > 0) {
                    results.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1); 
            } 
            
        int result[] = new int[results.size()];
        
        int i = 0;
        for(Iterator it=results.iterator();it.hasNext();)
        {
            result[i++] = (int)it.next();
        }
        
        return result;    
    }
}