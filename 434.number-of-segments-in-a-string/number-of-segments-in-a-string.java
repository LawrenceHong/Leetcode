public class Solution {
    public int countSegments(String s) {
        if(s.length() == 0)
            return 0;
            
        int cnt = 1;
        if(s.charAt(0) == ' ')
            cnt = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(i > 0 && s.charAt(i - 1) == ' ' && s.charAt(i) != ' ')
                cnt++;
        }
        
        return cnt;
    }
}