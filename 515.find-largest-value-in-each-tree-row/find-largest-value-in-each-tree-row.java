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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }
    
    private void helper(TreeNode root, List<Integer> res, int depth) {
        if(root == null)
            return;
        if(res.size() == depth)
            res.add(root.val);
        else
            res.set(depth, Math.max(root.val, res.get(depth)));
        
        helper(root.left, res, depth+1);
        helper(root.right, res, depth+1);
    }
}