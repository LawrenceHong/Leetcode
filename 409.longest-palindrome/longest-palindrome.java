public class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        int count = 0;
        for(Integer value : map.values()) {
            if(value % 2 == 1)
                count++;
        }
        
        return count == 0 ? s.length() : s.length() - count + 1;
    }
}