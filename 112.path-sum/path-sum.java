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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
            
        return preTurn(root, sum);
    }
    
    public boolean preTurn(TreeNode root, int sum) {
        if(root == null)
            return false;
       if(root.left == null && root.right == null && sum == root.val)
            return true;
       if(root.left == null && root.right == null && sum != root.val)
            return false;        
        
        return preTurn(root.left, sum - root.val) || preTurn(root.right, sum - root.val);
    }
}