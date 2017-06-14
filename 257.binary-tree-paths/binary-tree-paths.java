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
    public List<String> res = new ArrayList<String>();
    
    public void preTurn(TreeNode root, String single_res) {
        if(single_res != "")
            single_res = single_res + "->" + root.val;
        if(single_res == "")
            single_res += root.val;
            
        if(root.left == null && root.right == null)
            res.add(single_res);
        
        if(root.left != null)
            preTurn(root.left, single_res);
        if(root.right != null)    
            preTurn(root.right, single_res);
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return res;
            
        String single_res = "";
        preTurn(root, single_res);
        
        return res;
    }
}