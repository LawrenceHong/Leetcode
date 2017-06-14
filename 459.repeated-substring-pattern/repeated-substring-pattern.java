public class Solution {
    public boolean repeatedSubstringPattern(String s) {
       for (int i = 1; i <= s.length() / 2; i++) {
        if (s.length() % i != 0) {
            continue;
        }
        String pattern = s.substring(0, i);
        int start = i;
        while (start != s.length()) {
            if (!s.startsWith(pattern, start)) {
                break;
            }
            start += pattern.length();
        }
        if (start == s.length()) {
            return true;
        }
        
        }
        return false;
    }
}