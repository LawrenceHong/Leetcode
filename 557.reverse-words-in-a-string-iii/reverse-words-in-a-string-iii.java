public class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        String[] strs = s.split("\\s+");
        int start = 0;
        for(int i = 0; i < strs.length; i++) {
            reverse(ch, start, start + strs[i].length() - 1);
            start+=strs[i].length()+1;
        }
        
        return new String(ch);
    }
    
    private void reverse(char[] ch, int s, int e) {
        //System.out.println(e);
        while(s < e) {
            char tmp = ch[s];
            ch[s] = ch[e];
            ch[e] = tmp;
            s++;
            e--;
        }
    }
}