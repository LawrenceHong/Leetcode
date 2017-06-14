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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        preTurn(root, map);
        
        int max = Integer.MIN_VALUE;
        for(Integer v : map.values()) {
            max = Math.max(max, v);
        }
        
        for(Integer k : map.keySet()) {
            if(max == map.get(k))
                list.add(k);
        }
        
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        
        return arr;    
    }
    
    public void preTurn(TreeNode root, HashMap<Integer, Integer> map) {
        if(root ==null)
            return;
        
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        
        preTurn(root.left, map);
        preTurn(root.right, map);
    }
}