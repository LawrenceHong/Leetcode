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
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int max = 0;    
        return Math.max(max, preTurn(root, max));    
    }
    
    public int preTurn(TreeNode node, int max) {
        if(node == null)
            return max;
        else
            max++;
        return Math.max(preTurn(node.left, max), preTurn(node.right, max));
    }
}
