public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, list, nums, 0);
        return res;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int pos) {
        result.add(new ArrayList<Integer>(list));
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            helper(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}