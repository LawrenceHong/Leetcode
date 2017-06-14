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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        preTurn(root, res);
        
        return res;
    }
    
    public void preTurn(TreeNode root, List<Integer> res) {
        if(root == null)
            return;
        preTurn(root.left, res);
        res.add(root.val);
        preTurn(root.right, res);
    }
}