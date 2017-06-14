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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        
        //result.add(Arrays.asList(root.val));    
        preTurn(root, result, 0);
        return result;
    }
    
    public void preTurn(TreeNode root, List<List<Integer>> result, int level) {
        if(root == null)
            return;
        if(result.size() < level + 1) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            result.add(list);
        }
        else
            result.get(level).add(root.val);
            
        preTurn(root.left, result, level+1);
        preTurn(root.right, result, level+1);
    }
}