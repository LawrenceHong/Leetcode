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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root, result, list, sum);
        return result;
    }
    
    public void helper(TreeNode root, List<List<Integer>> result, List<Integer> list, int sum) {
        if(root == null)
            return;
        
        sum -= root.val;    
        if(root.left == null && root.right == null) {   
            if(sum == 0) {
                list.add(root.val);
                result.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
            return;
        }
        
        list.add(root.val);
        helper(root.left, result, list, sum);
        helper(root.right, result, list, sum);
        list.remove(list.size() - 1);
    }
}