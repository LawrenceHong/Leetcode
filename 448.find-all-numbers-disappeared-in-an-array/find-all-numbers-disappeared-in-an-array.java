public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //int n = 0;
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int v : nums) {
            map.put(v, v);
            //if(v > n)
            //n = v;
        }
        
        for(int i = 1; i <= nums.length; ++i) {
            if(map.containsKey(i) == false) {
                list.add(i);
            }
        }
        
        return list;
    }
}