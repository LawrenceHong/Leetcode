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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        height(root, res);
        return res;
    }
    
    private int height(TreeNode root, List<List<Integer>> res) {
        if(root == null) return -1;
        int level = 1 + Math.max(height(root.left, res), height(root.right, res));
        if(res.size() < level + 1) res.add(new ArrayList<>());
        res.get(level).add(root.val);
        
        return level;
    }
}