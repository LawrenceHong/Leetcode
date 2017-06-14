public class Solution {
    public boolean isPowerOfThree(int n) {
        /*
        if(n < 0)
            return isPowerOfThree(-n);
        if(n < 3 && n > 1)
            return false;
        if(n == 1)
            return true;
        
        if(n % 3 != 0)
            return false;
            
        return isPowerOfThree(n/3);    */
        //return (n > 0 && 1162261467 % n == 0);
        return (n > 0 && ((int)(Math.log10(n) / Math.log10(3)) - Math.log10(n) / Math.log10(3)) == 0);
	    //return (n > 0 && int(Math.log(n)/Math.log(3)) * Math.log(3) == Math.log(n));
    }
}