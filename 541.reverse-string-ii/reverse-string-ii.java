public class Solution {
    public String reverseStr(String s, int k) {
        if(s == null || s.length() == 0 || k == 0)
            return s;
        
        char[] ch = s.toCharArray();
        int start = 0;
        while(start < ch.length-1) {
            //System.out.println(start);
            int len = Math.min(k, ch.length - start);
            for(int i = 0; i < len/2; i++) {
                //System.out.println(len);
                char tmp = ch[i+start];
                ch[i+start] = ch[len - i - 1 + start];
                ch[len - i - 1 + start] = tmp;
            }
            
            start = start + 2*k;
        }
        
        return new String(ch);
    }
}