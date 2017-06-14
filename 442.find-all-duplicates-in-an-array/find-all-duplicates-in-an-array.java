public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] N = new int[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        for(int v : nums) {
            if(N[v - 1] == 0) {
                N[v - 1] = -1 * v;
                continue;
            }
            if(N[v - 1] == -1 * v) {
                list.add(v);
            }
        }
        
        return list;
    }
}