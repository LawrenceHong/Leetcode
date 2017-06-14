public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        String res = "";
        int carry = 0;
        
        while(i >= 0 || j >= 0) {
            int pa = 0;
            int pb = 0;
            
            if(i < 0)
                pa = 0;
            else
                pa = a.charAt(i) - '0';
                
            if(j < 0)
                pb = 0;
            else
                pb = b.charAt(j) - '0';
                
            res = (pa + pb + carry)%2 + res;
            if(pa + pb + carry > 1)
                carry = 1;
            else 
                carry = 0;
            i--;
            j--;
        }
        
        if(carry == 1)
        res = carry + res;
        
        return res;
    }
}