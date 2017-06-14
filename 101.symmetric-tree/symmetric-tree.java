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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        
        return isSameTree(root.left, root.right);    
    }
    
    public boolean isSameTree(TreeNode left, TreeNode right) {
        if(left == null)
            return right == null;
        if(right == null)
            return left == null;
            
        if(left.val != right.val)
            return false;
        
        return isSameTree(left.left, right.right) && isSameTree(left.right, right.left);    
    }
}