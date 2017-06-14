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
    public List<Integer> preorderTraversal(TreeNode root) {
    /*    List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        preTurn(root, res);
        
        return res;
    }
    
    public void preTurn(TreeNode root, List<Integer> res) {
        if(root == null)
            return;
        res.add(root.val);    
        preTurn(root.left, res);
        preTurn(root.right, res);
    }*/
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> preorder = new ArrayList<>();
        
        if(root == null)
            return preorder;
        
        stack.push(root);
        
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            preorder.add(node.val);
            
            if(node.right != null)
                stack.push(node.right);
            if(node.left != null)
                stack.push(node.left);    
        }
        
        return preorder;
    }
}