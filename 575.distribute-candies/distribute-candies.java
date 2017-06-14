public class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for(int c : candies)    set.add(c);
        
        return set.size() >= candies.length/2 ? candies.length/2 : set.size();
    }
}