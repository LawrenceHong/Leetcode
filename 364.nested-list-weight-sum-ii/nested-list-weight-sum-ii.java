/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nestedList, 0, res);
        int sum = 0;
        
        for(int i = 0; i < res.size(); i++) {
            for(int j = 0; j < res.get(i).size(); j++) {
                sum += res.get(i).get(j) * (res.size() - i);
            }
        }
        
        return sum;
    }
    
    private void helper(List<NestedInteger> nestedList, int depth, List<List<Integer>> res) {
        if(res.size() < depth+1)
            res.add(new ArrayList<Integer>());
        for(int i = 0; i < nestedList.size(); i++) {
            if(nestedList.get(i).isInteger())
                res.get(depth).add(nestedList.get(i).getInteger());
            else    
                helper(nestedList.get(i).getList(), depth+1, res);
        }
    }
}