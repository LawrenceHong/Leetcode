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
    //public void preTurn();
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null && q != null)
            return false;
        if(p != null && q == null)
            return false;
        if(p.val != q.val)
            return false;
            
        boolean retl = isSameTree(p.left, q.left);
        boolean retr = isSameTree(p.right, q.right);
        
        return retl && retr;
    }
}