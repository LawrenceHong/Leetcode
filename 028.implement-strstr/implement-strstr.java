public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())
            return -1;
        if(needle.length() == 0)
            return 0;
            
        int lenN = needle.length();
        int lenH = haystack.length();
        
        for(int i = 0; i < lenH; ++i) {
            if(haystack.charAt(i) == needle.charAt(0) && lenH - i >= lenN && haystack.substring(i, i + lenN).equals(needle))
                return i;
        }
        
        return -1;
    }
}