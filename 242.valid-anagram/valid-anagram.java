public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == 0 && t.length() == 0)
            return true;
        if(s.length() != t.length())
            return false;
        int[] temp = new int[26];
        for(int i = 0; i < s.length(); i++) {
            temp[s.charAt(i) - 'a']++;
            temp[t.charAt(i) - 'a']--;
        }
        
        for(int v : temp)
            if(v != 0) return false;
        
        return true;    
    }
}