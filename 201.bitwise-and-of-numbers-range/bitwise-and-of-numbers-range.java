public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        //int res = m;
        if(m == 0 || m == n) {
            return m;
        }
        
        int cnt = 0;
        while(m != n) {
            m >>= 1;
            n >>= 1;
            cnt++;
        }
        
        return m << cnt;
    }
}