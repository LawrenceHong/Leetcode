public class Solution {
    public String addStrings(String num1, String num2) {
        /*
        int carry = 0;
        //int len = Math.min(num1.length(), num2.length());
        
        int lnum1 = num1.length() -1;
        int lnum2 = num2.length() -1;
        int len = Math.max(lnum1, lnum2);
        String res = "";
        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i <= len; ++i) {
            if(lnum1 - i >= 0)
                n1 = num1.charAt(lnum1 - i) - '0';
            else
                n1 = 0;
            if(lnum2 - i >= 0)   
                n2 = num2.charAt(lnum2 - i) - '0';
            else
                n2 = 0;
                
            res = (n1 + n2)%10 + carry + res;
            System.out.println(n1);
            System.out.println(n2);
            carry = (n1 + n2)/10;
            //res += carry;
        }
        
        if(carry > 0)
            res = carry + res;
        
        return res;*/
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        String res = "";
        while (i >= 0 || j >= 0) {
            if (i >= 0)
                carry += num1.charAt(i--) - '0';
            if (j >= 0)
                carry += num2.charAt(j--) - '0';
            res = Integer.toString(carry % 10) + res;
            carry /= 10;
        }
        return carry != 0 ? "1" + res : res;
    }
}