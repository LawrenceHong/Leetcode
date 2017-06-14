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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        return preTurn(root);    
    }
    
    public int preTurn(TreeNode node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return Math.min(preTurn(node.left), preTurn(node.right)) + 1;    
    }
}