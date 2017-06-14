public class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums) {
            if(!set.contains(v))
                set.add(v);
            else
                set.remove(v);
        }
        
        int[] arr = new int[set.size()];
        int i = 0;
        for(Integer v : set) {
            arr[i++] = v;
        }
        
        return arr;
    }
}