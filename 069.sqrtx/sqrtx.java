public class Solution {
    public int mySqrt(int x) {
        long start = 1; 
        long end = x;
        
        while(start+1 < end) {
            long mid = start + (end - start)/2;
            if(mid * mid < x) {
                start = mid;
            } else if(mid * mid > x){
                end = mid;
            } else {
                return (int) mid;
            }
        }
        
        if (end * end <= x) {
            return (int) end;
        }
        return (int) start;
    }
}