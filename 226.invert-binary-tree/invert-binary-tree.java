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
    public void changeTree(TreeNode root) {
        if(root.left == null && root.right == null)
            return;
        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;
        
        if(root.left != null)
            changeTree(root.left);
        if(root.right != null)
            changeTree(root.right);
    }
    
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        changeTree(root);
        
        return root;
    }
}