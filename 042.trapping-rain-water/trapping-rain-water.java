public class Solution {
    public int trap(int[] h) {
        if(h.length < 3) return 0;
        
        int res = 0;
        int l = 0;
        int r = h.length - 1;
        
        while(l < r && h[l] <= h[l+1]) l++;
        while(l < r && h[r] <= h[r-1]) r--;
        
        while(l < r) {
            int left = h[l];
            int right = h[r];
            if(left <= right) {
                while(l < r && left >= h[++l]) res += left - h[l];
            }
            else {
                while(l < r && right >= h[--r]) res += right - h[r];
            }
        }
        
        return res;
    }
}