public class Solution {
    public boolean canPermutePalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        for(Character c : ch) {
            if(set.contains(c)) set.remove(c);
            else set.add(c);
        }
        
        return set.size() < 2 ? true : false;
    }
}