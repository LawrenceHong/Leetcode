public class Solution {
    public int findComplement(int num) {
        int res = 0;
        for(int i = 0; num != 0; ++i) {
            res += ((num & 1) == 1 ? 0 : 1) * Math.pow(2, i);
            num >>= 1;
            // System.out.println(res);
            // System.out.println(num);
        }
        
        return res;
    }
    
    // return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    
}