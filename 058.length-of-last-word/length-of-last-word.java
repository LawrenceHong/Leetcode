public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0)
            return 0;
            
        int i = s.length() - 1;
        int cnt = 0;
        //System.out.println(i);
        while(i>=0 && (cnt == 0 || s.charAt(i) != ' ')) {
            //System.out.println(cnt);
            if(cnt == 0 && s.charAt(i) == ' ') {
                i--;
                continue;
            }
            //System.out.println(cnt);
            if(s.charAt(i) != ' ') {
                cnt++;
                i--;
                continue;
            } 
            System.out.println(cnt);
            if(cnt != 0 && s.charAt(i) == ' ') {
                break;    
            }
            
            //System.out.println(cnt);
        }
        
        return cnt;
    }
}