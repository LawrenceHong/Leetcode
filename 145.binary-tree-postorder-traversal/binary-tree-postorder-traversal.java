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
    public List<Integer> postorderTraversal(TreeNode root) {
    /*    List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }
    
    public void postorder(TreeNode root, List<Integer> list) {
        if(root == null)
            return;
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }*/
    Stack<TreeNode> stack = new Stack<>();
        List<Integer> postorder = new ArrayList<>();
        
        if(root == null)
            return postorder;
        
        stack.push(root);
        
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            postorder.add(node.val);
            
            if(node.left != null)
                stack.push(node.left);
            if(node.right != null)
                stack.push(node.right);
        }
        
        Collections.reverse(postorder);
        return postorder;
    }
}