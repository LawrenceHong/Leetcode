public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> res = new ArrayList<>();
        if (p == null || s == null || s.length() < p.length() || (s.length() == p.length() && !s.equals(p))) return res;
        int m = s.length(), n = p.length();
        for (int i = 0; i < m-n+1; i++) {
            String cur = s.substring(i, i+n);
            if (helper(cur, p)) res.add(i);
        }
        return res;
    }
    
    // private boolean helper(String s1, String s2) {
    //     int s = 0;
    //     for(int i = 0; i < s1.length(); i++) {
    //         s ^= s1.charAt(i) ^ s2.charAt(i); 
    //     }
        
    //     return s == 0 ? true : false;
    // }
    public boolean helper(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) return false;
        int[] dict = new int[26];
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            dict[ch-'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            dict[ch-'a']--;
            if (dict[ch-'a'] < 0) return false;
        }
        return true;
    }
}