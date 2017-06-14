public class Solution {
    public int myAtoi(String str) {
        if(str == null)
            return 0;
        
        str = str.trim();
        if(str.length() == 0)
            return 0;
        
        int sign = 1;
        int index = 0;
        if(str.charAt(0) == '-') {
            sign = -1;
            index++;
        }
        else if(str.charAt(0) == '+')
            index++;
        //System.out.println(sign);    
        long num = 0;
        for(int i = index; i < str.length(); ++i) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9')
                break;
            num = num*10 + (str.charAt(i) - '0');
            if(num >= Integer.MAX_VALUE)
                break;
        }
        
        if(sign * num >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(sign * num <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            
        return sign*(int)num;    
    }
}