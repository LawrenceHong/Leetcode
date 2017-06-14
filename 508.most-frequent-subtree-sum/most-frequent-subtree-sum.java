/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int max = -1;
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null) return new int[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        helper(root, map);
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> me : map.entrySet()) {
            if(me.getValue() == max) res.add(me.getKey());
        }
        
        return res.stream().mapToInt(i->i).toArray();
    }
    
    private int helper(TreeNode root, HashMap<Integer, Integer> map) {
        int left = (root.left == null) ? 0 : helper(root.left, map);
        int right = (root.right == null) ? 0 : helper(root.right, map);
        int sum = left + right + root.val;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        max = Math.max(max, map.get(sum));
        return sum;
    }
}