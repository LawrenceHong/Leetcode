public class Solution {
    public int hammingDistance(int x, int y) {
        
   
        /*
        int res = 0;
        for (int i = 0; i < 32; ++i) {
            if (((x & (1 << i)) ^ (y & (1 << i))) == 1) {
                ++res;
            }
        }
        return res;*/
        int res = 0, exc = x ^ y;
        for (int i = 0; i < 32; ++i) {
            res += (exc >> i) & 1;
        }
        return res;
    }
}