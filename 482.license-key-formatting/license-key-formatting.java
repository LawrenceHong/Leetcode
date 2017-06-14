public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "").toUpperCase();
        if(s.length() == 0) return "";
        
        int firstLen = s.length() % k;
        
        StringBuilder sb = new StringBuilder();
        if(firstLen != 0)
            sb.append(s.substring(0, firstLen)).append("-");
        
        for(int i = firstLen; i < s.length(); i+=k)
            sb.append(s.substring(i, i+k)).append("-");
        
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}